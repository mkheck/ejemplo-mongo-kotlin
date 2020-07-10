package com.thehecklers.ejemplomongokotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
data class Aircraft(@Id val id: String,
                    val callsign: String? = null,
                    val squawk: String? = null,
                    val reg: String? = null,
                    val flightno: String? = null,
                    val route: String? = null,
                    val type: String? = null,
                    val category: String? = null,
                    val altitude: Int? = null,
                    val heading: Int? = null,
                    val speed: Int? = null,
                    @JsonProperty("vert_rate") val vertRate: Int? = null,
                    @JsonProperty("selected_altitude") val selectedAltitude: Int? = null,
                    val lat: Double? = null,
                    val lon: Double? = null,
                    val barometer: Double? = null,
                    @JsonProperty("polar_distance") val polarDistance: Double? = null,
                    @JsonProperty("polar_bearing") val polarBearing: Double? = null,
                    @JsonProperty("is_adsb") val isADSB: Boolean? = null,
                    @JsonProperty("is_on_ground") val isOnGround: Boolean? = null,
                    @JsonProperty("last_seen_time") val lastSeenTime: Instant? = null,
                    @JsonProperty("pos_update_time") val posUpdateTime: Instant? = null,
                    @JsonProperty("bds40_seen_time") val bds40SeenTime: Instant? = null)

/*
data class Aircraft(@Id val id: String,
                    val callsign: String? = "",
                    val squawk: String? = "",
                    val reg: String? = "",
                    val flightno: String? = "",
                    val route: String? = "",
                    val type: String? = "",
                    val category: String? = "",
                    val altitude: Int? = 0,
                    val heading: Int? = 0,
                    val speed: Int? = 0,
                    @JsonProperty("vert_rate") val vertRate: Int? = 0,
                    @JsonProperty("selected_altitude") val selectedAltitude: Int? = 0,
                    val lat: Double? = 0.0,
                    val lon: Double? = 0.0,
                    val barometer: Double? = 0.0,
                    @JsonProperty("polar_distance") val polarDistance: Double? = 0.0,
                    @JsonProperty("polar_bearing") val polarBearing: Double? = 0.0,
                    @JsonProperty("is_adsb") val isADSB: Boolean? = false,
                    @JsonProperty("is_on_ground") val isOnGround: Boolean? = false,
                    @JsonProperty("last_seen_time") val lastSeenTime: Instant? = Instant.ofEpochSecond(0),
                    @JsonProperty("pos_update_time") val posUpdateTime: Instant? = Instant.ofEpochSecond(0),
                    @JsonProperty("bds40_seen_time") val bds40SeenTime: Instant? = Instant.ofEpochSecond(0))

*/
