package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TareaHorarios {

  // it runs every 3 secs
  // you can also use cron instead of fixedRate for a task to run at a specific time in certain days
  @Scheduled(fixedRate = 3000)
  public void tarea() {
    System.out.println("every 3 secs");
  }
}
