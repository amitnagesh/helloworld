package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/helloworld")
public class Rest {

  @Autowired
  RestController restController;

  @RequestMapping(method= RequestMethod.GET, value="/sayhello/" )
  public String sayHello(){
    return restController.sayHello();
  }

  @RequestMapping(method= RequestMethod.GET, value="/sayhi/{name}" )
  public String sayHi(@PathVariable String name){
    return restController.sayHi(name);
  }
}
