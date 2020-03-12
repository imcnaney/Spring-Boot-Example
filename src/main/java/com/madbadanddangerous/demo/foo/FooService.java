package com.madbadanddangerous.demo.foo;

import com.madbadanddangerous.demo.messages.FooMessage;

public interface FooService {

  public FooMessage getFoo(Integer id);
  
  public FooMessage putFoo(FooMessage foo);

}
