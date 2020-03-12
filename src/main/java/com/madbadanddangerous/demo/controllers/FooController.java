package com.madbadanddangerous.demo.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.madbadanddangerous.demo.foo.FooService;
import com.madbadanddangerous.demo.messages.FooMessage;
import com.madbadanddangerous.demo.util.Jsonifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {

  private final Logger log = LoggerFactory.getLogger(FooController.class);
  
  private final Jsonifier jsonifier;
  private final FooService fooService;
  
  /**
   * By default all constructor parameters are automatically autowired, so there's no need to use
   * the annotation.
   */
  public FooController(Jsonifier jsonifier, FooService fooService) {
    this.jsonifier = jsonifier;
    this.fooService = fooService;
  }

  @RequestMapping(path = "/{fooId}", method = RequestMethod.GET, produces = "application/json")
  public FooMessage getFoo(@PathVariable("fooId") Integer fooId) {
    log.info("GET: " + fooId);
    return fooService.getFoo(fooId);
  }

  @RequestMapping(path = "/", method = RequestMethod.POST, produces = "application/json")
  public FooMessage putFoo(@RequestBody FooMessage fooMessage) throws JsonProcessingException {
    log.info("POST: " + jsonifier.toJson(fooMessage));
    return fooService.putFoo(fooMessage);
  }

}
