package com.adamguar.trafficlaws.country.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.adamguar.trafficlaws.country.repository.pojo.Country;

public interface CountryRepository extends MongoRepository<Country, String>{
    
    @Query("{'ISO Code':?0}")
    Country findCountryByISOCode(String isoCode);

    public long count();
}
