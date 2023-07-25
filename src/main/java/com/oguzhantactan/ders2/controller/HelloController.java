package com.oguzhantactan.ders2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

  // @RequestMapping(path = "/hello", method = RequestMethod.GET)
  @GetMapping(path = "/hello")
  public String sayHello(){
    return "Hello World!";
  }

  @PostMapping(path = "/save")
  public String save(){
    return "Data saved!";
  }

  @DeleteMapping(path = "/delete")
  public String delete(){
    return "Data deleted!";
  }
}
