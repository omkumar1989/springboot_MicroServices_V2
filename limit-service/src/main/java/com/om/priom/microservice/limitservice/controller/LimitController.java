package com.om.priom.microservice.limitservice.controller;

import com.om.priom.microservice.limitservice.config.LimitConfiguration;
import com.om.priom.microservice.limitservice.dto.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController  {

    @Autowired
    private LimitConfiguration limitConfig;
    @GetMapping("/limit")
    public Limit getLimitData(){
        return new Limit(limitConfig.getMin(), limitConfig.getMax());
    }
}
