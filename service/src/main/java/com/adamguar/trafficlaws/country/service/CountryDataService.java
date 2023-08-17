package com.adamguar.trafficlaws.country.service;

import java.util.List;

import com.adamguar.trafficlaws.country.model.CountryData;

public interface CountryDataService {
    public List<CountryData> getCountryDataByISOCode(String iscoCode);
}
