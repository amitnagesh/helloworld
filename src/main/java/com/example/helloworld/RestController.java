package com.example.helloworld;

import org.springframework.stereotype.Controller;

@Controller
public class RestController {

  public String sayHello(){
    return "Hello!";
  }

  public String sayHi(String name){
    return "Hi " +name ;
  }

}
