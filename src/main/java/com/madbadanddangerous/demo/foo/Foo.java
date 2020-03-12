package com.madbadanddangerous.demo.foo;

import com.madbadanddangerous.demo.messages.FooMessage;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is just a standard bean with some annotations telling the persistence framework what to do.
 * You shouldn't ever have to set the ID yourself. If there isn't one it'll be generated for you,
 * and if there is one setting it implies changing it, which you probably don't want to do.
 */
@Entity
public class Foo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String message;

  /** required for JPA */
  protected Foo() {
  }

  public Foo(String message) {
    this.message = message;
  }

  public Integer getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  
  public FooMessage toFooMessage() {
    return new FooMessage(getId(), getMessage());
  }
  
  public static class Util {
    public static Foo fromFooMessage(FooMessage fm) {
      // intentionally omitting the ID
      return new Foo(fm.getMessage());
    }
  }

}
