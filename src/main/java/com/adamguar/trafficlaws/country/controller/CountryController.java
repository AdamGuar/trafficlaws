package com.adamguar.trafficlaws.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adamguar.trafficlaws.country.model.CountryData;
import com.adamguar.trafficlaws.country.model.CountryResponseModel;
import com.adamguar.trafficlaws.country.service.ICountryDataService;

@RestController
@RequestMapping("country")
public class CountryController {

    private ICountryDataService countryDataService;

    @Autowired
    public CountryController(ICountryDataService countryDataService) {
        this.countryDataService = countryDataService;
    }

    @GetMapping("{isoCode}")
    public CountryResponseModel getCountry(@PathVariable String isoCode) {
        List<CountryData> results = countryDataService.getCountryDataByISOCode(isoCode);
        return new CountryResponseModel(200, "OK", results);
    }
    
}
