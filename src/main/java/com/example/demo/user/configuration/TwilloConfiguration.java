package com.example.demo.user.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class TwilloConfiguration {

    @Value("${twillo.sid}")
    private String sid;

    @Value("${twillo.token}")
    private String token;

    @Value("${twillo.url}")
    private String url;

}
