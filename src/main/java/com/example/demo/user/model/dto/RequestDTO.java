package com.example.demo.user.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RequestDTO {
    @JsonProperty("user")
    private UserDTO userDTO;
}
