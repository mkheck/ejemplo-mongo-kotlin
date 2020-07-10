package com.thehecklers.ejemplomongokotlin

import org.springframework.data.repository.CrudRepository

interface AircraftRepository: CrudRepository<Aircraft, String>
