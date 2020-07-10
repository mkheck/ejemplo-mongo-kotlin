package com.thehecklers.ejemplomongokotlin

import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToFlux

@Component
@EnableScheduling
class PollPlaneFinder(private val repository: AircraftRepository) {
    private val client = WebClient.create("http://localhost:8080")

    init {
        repository.deleteAll()
    }

    @Scheduled(fixedRate = 1000)
    private fun pollPlanes() {
        client.get()
            .retrieve()
            .bodyToFlux<Aircraft>()
            .filter { plane -> !plane.reg.isNullOrEmpty() }
            .toStream()
            .forEach { repository.save(it) }

        println("--- All aircraft ---")
        repository.findAll().forEach { println(it) }
    }
}