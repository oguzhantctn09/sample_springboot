package com.oguzhantactan.ders2.controller;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

  @GetMapping(path = "/message")
  public String getMyMessage(@RequestParam String message){
    return "Your message is: " + message;
  }
}
