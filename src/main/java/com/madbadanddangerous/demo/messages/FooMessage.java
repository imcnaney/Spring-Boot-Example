package com.madbadanddangerous.demo.messages;

/**
 * Strictly speaking you don't have to use a separate message class. You could JSONify your Foo
 * entity class directly, although maybe you want to include things in it that shouldn't be
 * externally exposed. It seems a better idea to explicitly create an externally visible version,
 * although it is a bit tedious. You can tell Jackson to ignore specific fields by annotating them,
 * but that's easy to forget to do, and then you're accidentally leaking data. Maybe there's a
 * better way but diving into the intricacies of Jackson isn't the point of this example.
 */
public class FooMessage {

  private Integer id;
  private String message;

  /*
   * Required for Jackson
   */
  @SuppressWarnings("unused")
  private FooMessage() {
  }

  public FooMessage(Integer id, String message) {
    this.id = id;
    this.message = message;
  }

  public Integer getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }

}
