package com.kg.walkbababackend.model.openai;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record UserRequestDTO(String country, String city, String duration, String theme, Boolean roundTrip) {
}
