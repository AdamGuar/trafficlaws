package com.adamguar.trafficlaws.country.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class CountryData {

    private String isoCode;
    private String plateCode;
    private String name;

    private List<CountyLawProperty> trafficLaws;
}
