package com.sp.service.impl;

import org.springframework.stereotype.Service;

import com.sp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    public String getUserName() {
        System.out.println("#in service");
        return "LGJ";
    }

}
