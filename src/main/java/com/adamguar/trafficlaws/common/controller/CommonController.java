package com.adamguar.trafficlaws.common.controller;

import java.time.Instant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.adamguar.trafficlaws.common.model.ResponseModel;

@RestController
@RequestMapping("common")
public class CommonController {
    
    @GetMapping("/health")
    public ResponseModel getHealthCheck() {
        long time = Instant.now().getEpochSecond();
        return new ResponseModel(200, String.valueOf(time));
    }
}