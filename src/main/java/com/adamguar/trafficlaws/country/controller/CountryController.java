package com.adamguar.trafficlaws.country.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adamguar.trafficlaws.country.model.CountryResponseModel;
import com.adamguar.trafficlaws.country.repository.CountryRepository;
import com.adamguar.trafficlaws.country.repository.pojo.Country;

@RestController
@RequestMapping("country")
public class CountryController {

    private CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("{isoCode}")
    public CountryResponseModel getCountry(@PathVariable String isoCode) {
        Country result = countryRepository.findCountryByISOCode(isoCode);
        List<Country> results = new ArrayList<Country>();

        results.add(result);

        return new CountryResponseModel(200, "OK", results);
    }
    
}
