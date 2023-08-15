package com.adamguar.trafficlaws.country.model;

import java.util.List;

import com.adamguar.trafficlaws.country.repository.pojo.Country;

import lombok.*;

@Getter @Setter @AllArgsConstructor
public class CountryResponseModel {
    private int code;
    private String message;
    private List<Country> items;
}
