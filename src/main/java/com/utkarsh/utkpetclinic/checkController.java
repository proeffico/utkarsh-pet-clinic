package com.utkarsh.utkpetclinic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class checkController {


    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "<h1>Hello World!everything is working fine!!</h1>";
    }


}
