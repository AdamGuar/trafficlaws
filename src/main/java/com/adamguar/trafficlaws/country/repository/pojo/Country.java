package com.adamguar.trafficlaws.country.repository.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Document("countries")
@Getter @Setter @AllArgsConstructor
public class Country {
    
    @Id
    private String id;

    @Field("ISO Code")
    private String isoCode;

    @Field("Country code")
    private String plateCode;

    @Field("Country")
    private String country;

    @Field("Speed limit on motorway (km/h)")
    private String speedLimitMotorway;

    @Field("Speed limit on dual carriageway (km/h)")
    private String speedLimitDualCarriageway;

    @Field("Speed limit on single carriageway (km/h)")
    private String speedLimitSingleCarriageway;

    @Field("Speed limit in urban area")
    private String speedLimitUrban;

    @Field("Permitted alcohol level (%)")
    private String alcoholLvl;

    @Field("Seatbelt required")
    private String seatbeltRequired;
 
    @Field("Minimum child age (front seat)")
    private String minimunChildAgeFrontSeat;

    @Field("Triangle required")
    private String triangleRequired;

    @Field("First aid required")
    private String firstAidKitRequired;

    @Field("Fire extinguisher required")
    private String fireExtinguisherRequired;

    @Field("Spare bulb required")
    private String spareLightBuldRequired;

    @Field("Minimum driver's age")
    private String minimumDriversAge;

    @Field("Tow rope required")
    private String towRopeRequired;
}
