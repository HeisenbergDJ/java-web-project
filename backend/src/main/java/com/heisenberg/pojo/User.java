package com.heisenberg.pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userAccount;
    private String userName;
    private String userPassword;
    private Integer userAge;
    private Integer userSex;
    private String userPhone;
    private Integer userRole_id;
    private String userIsValid;
}
