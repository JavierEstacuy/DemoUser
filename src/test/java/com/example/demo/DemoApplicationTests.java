package com.example.demo;

import com.example.demo.user.service.TwilloClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	TwilloClientService twilloClientService;

	@Test
	void contextLoads() throws URISyntaxException, UnsupportedEncodingException {
	}

}
