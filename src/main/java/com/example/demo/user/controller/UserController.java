package com.example.demo.user.controller;

import com.example.demo.user.model.dto.RequestDTO;
import com.example.demo.user.model.dto.UserDTO;
import com.example.demo.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<UserDTO> addUser(@RequestBody RequestDTO requestDTO) throws IOException, URISyntaxException {
        log.info("request received to add new user");
        UserDTO userDTO=userService.addUser(requestDTO.getUserDTO());
        return ResponseEntity.ok(userDTO);
    }
}