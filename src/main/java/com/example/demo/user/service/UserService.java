package com.example.demo.user.service;

import com.example.demo.user.model.dao.UserEntity;
import com.example.demo.user.model.dto.UserDTO;
import com.example.demo.user.model.dto.twillo.ResponseTwillo;
import com.example.demo.user.repository.UserRepositoryToFile;
import com.example.demo.user.util.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.UUID;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRepositoryToFile userRepository;

    @Autowired
    TwilloClientService twilloClientService;

    @Autowired
    UserMapper userMapper;

    public UserDTO addUser(UserDTO userDTO) throws IOException, URISyntaxException {
        log.info("adding new user: {} {}", userDTO.getFirstName(), userDTO.getLastName());
        String smsId=sendConfirmationSms(userDTO);
        log.info("mapping dto to entity");
        UserEntity userEntity = userMapper.toEntity(userDTO);
        userEntity.setSmsId(smsId);
        userRepository.save(userEntity);
        log.info("user saved with id: {}", userEntity.getId());
        userDTO.setId(userEntity.getId());
        return userDTO;
    }

    private String sendConfirmationSms(UserDTO userDTO) throws UnsupportedEncodingException, URISyntaxException {
        log.info("generating and sending confirmation code to phone number:{}",userDTO.getPhone());
        String toPhone=userDTO.getCountryCode().replace("+","")+userDTO.getPhone();
        String confirmationCode = UUID.randomUUID().toString().substring(0, 4);
        String message = "Hola " + userDTO.getFirstName() + " ingrese este codigo para verificar su numero telefonico: " + confirmationCode;
        ResponseTwillo responseTwillo=twilloClientService.sendSms(toPhone, message);
        return responseTwillo.getSid();
    }
}