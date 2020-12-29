package com.veronika.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postgres")
public class AppController {

  @GetMapping
  public String hello(){
    return "HelloWorld";
  }
}
