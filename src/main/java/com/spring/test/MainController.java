package com.spring.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String main(){
        return "Hello World!";
    }

}
