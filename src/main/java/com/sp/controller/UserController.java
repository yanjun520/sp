package com.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sp.aop.ServiceAOP;
import com.sp.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private ServiceAOP serviceAOP;
    
	@RequestMapping("/get")
	@ResponseBody
    public String index(Model model) {
//	    Params params = new Params();
//	    params.set("id", "1234");
//	    UserServiceImpl userService = new UserServiceImpl();
        return "Hi " + userService.getUserName();
    }
	
}
