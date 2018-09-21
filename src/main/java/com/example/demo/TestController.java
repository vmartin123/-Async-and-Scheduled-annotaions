package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

  @Autowired
  HelloAsyncService helloAsyncService;

  @GetMapping("/greet")
  public String hello() throws InterruptedException {
    System.out.println("Thread name init: " + Thread.currentThread().getName());

    System.out.println("before");
    String greet = helloAsyncService.hello();
    System.out.println("after");

    return greet;
  }
}
