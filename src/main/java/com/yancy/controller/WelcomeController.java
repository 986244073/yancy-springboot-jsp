package com.yancy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * @Authur : Yancy
 * @E-mail : 986244073@qq.com
 * @Create : 2019/6/18
 * @Desc :
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Map<String,Object> model){
        model.put("time",new Date());
        model.put("message","hello world!");
        return "welcome";
    }
}
