package com.jgc.junit.spring.main;







import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.jgc.junit.spring.service.SampleService;
import com.jgc.junit.spring.service.SampleServiceImpl;

@Configuration

public class AppConfig {

 @Bean

 public SampleService getSampleService() {

 return new SampleServiceImpl();

 }
}