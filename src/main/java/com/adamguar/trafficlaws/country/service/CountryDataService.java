package com.adamguar.trafficlaws.country.service;

import java.util.List;

import com.adamguar.trafficlaws.country.model.CountryData;

public interface ICountryDataService {
    public List<CountryData> getCountryDataByISOCode(String iscoCode);
}
