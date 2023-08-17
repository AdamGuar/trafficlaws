package com.adamguar.trafficlaws.country.model.builders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.adamguar.trafficlaws.country.model.CountryData;
import com.adamguar.trafficlaws.country.model.CountyLawProperty;
import com.adamguar.trafficlaws.country.repository.pojo.Country;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class CountryDataBuilder {
    private String isoCode;
    private String plateCode;
    private String name;
    private List<CountyLawProperty> trafficLaws;

    public static Map<String, String> DISPLAY_NAME_MAPPING;
    static {
        DISPLAY_NAME_MAPPING = new HashMap<>();
        DISPLAY_NAME_MAPPING.put("speedLimitMotorway", "Speed limit on motorway (km/h)");
        DISPLAY_NAME_MAPPING.put("speedLimitDualCarriageway", "Speed limit on dual carriageway (km/h)");
        DISPLAY_NAME_MAPPING.put("speedLimitSingleCarriageway", "Speed limit on single carriageway (km/h)");
        DISPLAY_NAME_MAPPING.put("speedLimitUrban", "Speed limit in urban area");
        DISPLAY_NAME_MAPPING.put("alcoholLvl", "Permitted alcohol level (%)");
        DISPLAY_NAME_MAPPING.put("seatbeltRequired", "Seatbelt required");
        DISPLAY_NAME_MAPPING.put("minimunChildAgeFrontSeat", "Minimum child age (front seat)");
        DISPLAY_NAME_MAPPING.put("triangleRequired", "Triangle required");
        DISPLAY_NAME_MAPPING.put("firstAidKitRequired", "First aid required");
        DISPLAY_NAME_MAPPING.put("fireExtinguisherRequired", "Fire extinguisher required");
        DISPLAY_NAME_MAPPING.put("spareLightBuldRequired", "Spare bulb required");
        DISPLAY_NAME_MAPPING.put("minimumDriversAge", "Minimum driver's age");
        DISPLAY_NAME_MAPPING.put("towRopeRequired", "Tow rope required");
    }

    public CountryDataBuilder fromCountryDbObject(Country country) {
        this.isoCode = country.getIsoCode();
        this.plateCode = country.getIsoCode();
        this.name = country.getCountry();

        var props = new ArrayList<CountyLawProperty>();

        var speedLimitMotorwayProp = new CountyLawProperty("speedLimitMotorway", DISPLAY_NAME_MAPPING.get("speedLimitMotorway"), country.getSpeedLimitMotorway());
        props.add(speedLimitMotorwayProp);

        var speedLimitDualCarriageway = new CountyLawProperty("speedLimitDualCarriageway", DISPLAY_NAME_MAPPING.get("speedLimitDualCarriageway"), country.getSpeedLimitDualCarriageway());
        props.add(speedLimitDualCarriageway);

        var speedLimitSingleCarriageway = new CountyLawProperty("speedLimitSingleCarriageway", DISPLAY_NAME_MAPPING.get("speedLimitSingleCarriageway"), country.getSpeedLimitSingleCarriageway());
        props.add(speedLimitSingleCarriageway);

        var speedLimitUrban = new CountyLawProperty("speedLimitUrban", DISPLAY_NAME_MAPPING.get("speedLimitUrban"), country.getSpeedLimitUrban());
        props.add(speedLimitUrban);

        var alcoholLvl = new CountyLawProperty("alcoholLvl", DISPLAY_NAME_MAPPING.get("alcoholLvl"), country.getAlcoholLvl());
        props.add(alcoholLvl);

        var seatbeltRequired = new CountyLawProperty("seatbeltRequired", DISPLAY_NAME_MAPPING.get("seatbeltRequired"), country.getSeatbeltRequired());
        props.add(seatbeltRequired);

        var minimunChildAgeFrontSeat = new CountyLawProperty("minimunChildAgeFrontSeat", DISPLAY_NAME_MAPPING.get("minimunChildAgeFrontSeat"), country.getMinimunChildAgeFrontSeat());
        props.add(minimunChildAgeFrontSeat);

        var triangleRequired = new CountyLawProperty("triangleRequired", DISPLAY_NAME_MAPPING.get("triangleRequired"), country.getTriangleRequired());
        props.add(triangleRequired);

        var firstAidKitRequired = new CountyLawProperty("firstAidKitRequired", DISPLAY_NAME_MAPPING.get("firstAidKitRequired"), country.getFirstAidKitRequired());
        props.add(firstAidKitRequired);

        var fireExtinguisherRequired = new CountyLawProperty("fireExtinguisherRequired", DISPLAY_NAME_MAPPING.get("fireExtinguisherRequired"), country.getFireExtinguisherRequired());
        props.add(fireExtinguisherRequired);

        var spareLightBuldRequired = new CountyLawProperty("spareLightBuldRequired", DISPLAY_NAME_MAPPING.get("spareLightBuldRequired"), country.getSpareLightBuldRequired());
        props.add(spareLightBuldRequired);

        var minimumDriversAge = new CountyLawProperty("minimumDriversAge", DISPLAY_NAME_MAPPING.get("minimumDriversAge"), country.getMinimumDriversAge());
        props.add(minimumDriversAge);

        var towRopeRequired = new CountyLawProperty("towRopeRequired", DISPLAY_NAME_MAPPING.get("towRopeRequired"), country.getTowRopeRequired());
        props.add(towRopeRequired);

        this.trafficLaws = props;

        return this;
    }

    public CountryData build() {
        return new CountryData(this.isoCode, this.plateCode, this.name, this.trafficLaws);
    }
}
