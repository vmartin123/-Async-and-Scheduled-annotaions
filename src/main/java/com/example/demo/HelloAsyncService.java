package com.example.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class HelloAsyncService {

  @Async
  public String hello() throws InterruptedException {
    Thread.sleep(5000);
    System.out.println("Thread name async: " + Thread.currentThread().getName());
    return "hello";
  }
}
