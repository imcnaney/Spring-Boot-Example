package com.madbadanddangerous.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  /**
   * Runs once the context is initialized and everything's ready to go.
   * You can have multiple of these.
   */
  @Bean
  public CommandLineRunner commandLineRunner() {
    return args -> {
      System.out.println("Listening...");
    };
  }

}
