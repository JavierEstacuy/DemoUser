package com.example.demo.user.service;


import com.example.demo.user.configuration.TwilloConfiguration;
import com.example.demo.user.model.dto.twillo.ResponseTwillo;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

@Service
@Slf4j
public class TwilloClientService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TwilloConfiguration twilloConfiguration;

    public ResponseTwillo sendSms(String to, String message) throws URISyntaxException, UnsupportedEncodingException {
        log.info("sending sms:{} to number:{}", to, message);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + generateCredentials());
        headers.add("Content-Type", "application/x-www-form-urlencoded");

        URI url = new URI(twilloConfiguration.getUrl());

        message = URLEncoder.encode(message, "UTF-8");
        System.out.println(message);
        String body = "From=16182304615&To=" + to + "&Body=" + message;

        ResponseEntity<ResponseTwillo> responseEntity = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<String>(body, headers), ResponseTwillo.class);
        log.info("sms sent, sms id:{}", responseEntity.getBody().getSid());
        return responseEntity.getBody();
    }

    private String generateCredentials() {
        String plainCreds = twilloConfiguration.getSid() + ":" + twilloConfiguration.getToken();
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        return new String(base64CredsBytes);
    }

}
