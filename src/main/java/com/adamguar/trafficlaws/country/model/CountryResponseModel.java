package com.adamguar.trafficlaws.country.model;

import java.util.List;
import lombok.*;

@Getter @Setter @AllArgsConstructor
public class CountryResponseModel {
    private int code;
    private String message;
    private List<CountryData> items;
}
