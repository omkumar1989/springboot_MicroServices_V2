package com.om.priom.microservice.limitservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("limit-service")
public class LimitConfiguration {
    private int min;
    private int max;
}
