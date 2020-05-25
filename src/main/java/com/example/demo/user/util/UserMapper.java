package com.example.demo.user.util;

import com.example.demo.user.model.dao.UserEntity;
import com.example.demo.user.model.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper{


    public UserDTO toDTO(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(userEntity.getFirstName());
        userDTO.setLastName(userEntity.getLastName());
        userDTO.setPhone(userEntity.getPhone());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setId(userEntity.getId());
        return userDTO;
    }

    public UserEntity toEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDTO.getFirstName());
        userEntity.setLastName(userDTO.getLastName());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setId(userDTO.getId());
        return userEntity;
    }
}
