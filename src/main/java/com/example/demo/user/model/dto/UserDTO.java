package com.example.demo.user.model.dto;

import lombok.Data;

@Data
public class UserDTO {
    String id;
    String firstName;
    String lastName;
    String phone;
    String countryCode;
    String email;
}
