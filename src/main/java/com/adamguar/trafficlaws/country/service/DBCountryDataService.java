package com.adamguar.trafficlaws.country.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adamguar.trafficlaws.country.model.CountryData;
import com.adamguar.trafficlaws.country.model.builders.CountryDataBuilder;
import com.adamguar.trafficlaws.country.repository.CountryRepository;
import com.adamguar.trafficlaws.country.repository.pojo.Country;

@Service
public class CountryDataService implements ICountryDataService{

    private CountryRepository countryRepository;
    private CountryDataBuilder countryDataBuilder;

    @Autowired
    public CountryDataService(CountryRepository countryRepository, CountryDataBuilder countryDataBuilder){
        this.countryRepository = countryRepository;
        this.countryDataBuilder = countryDataBuilder;
    }

    @Override
    public List<CountryData> getCountryDataByISOCode(String isoCode) {
        Country result = countryRepository.findCountryByISOCode(isoCode);
        CountryData countryData = countryDataBuilder.fromCountryDbObject(result).build();

        List<CountryData> response = new ArrayList<>();
        response.add(countryData);

        return response;
    }    
}
