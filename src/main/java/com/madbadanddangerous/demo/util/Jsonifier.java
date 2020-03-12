package com.madbadanddangerous.demo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class Jsonifier {
  
  private ObjectMapper om;
  
  public Jsonifier(ObjectMapper om) {
    this.om = om;
  }
  
  public String toJson(Object o) throws JsonProcessingException {
    return om.writeValueAsString(o);
  }

}
