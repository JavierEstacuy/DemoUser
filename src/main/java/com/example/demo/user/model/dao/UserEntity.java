package com.example.demo.user.model.dao;

import lombok.Data;

import java.util.Date;

@Data
public class UserEntity {
    //Esta clase sirve para representar un usuario
    //según la base de datos
    //NO DEBE USARSE para ningún fin que no sea ese
    String id;
    String firstName;
    String lastName;
    String phone;
    String email;
    Date createDate;
    Date updateDate;
    String smsId;//identificador del sms enviado

    @Override
    public String toString(){
        return id+";"+firstName+";"+lastName+";"+phone+";"+email+";"+createDate+";"+updateDate+";"+smsId+";";
    }
}
