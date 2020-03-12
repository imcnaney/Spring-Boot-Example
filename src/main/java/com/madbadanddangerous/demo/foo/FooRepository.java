package com.madbadanddangerous.demo.foo;

import org.springframework.data.repository.CrudRepository;

/**
 * This isn't public because we probably don't want to allow going straight to the repo. That
 * implies bypassing the FooService with all the business logic, which is a dangerous thing to
 * allow.
 */
interface FooRepository extends CrudRepository<Foo, Integer>{

  // note that there's nothing here.  We get "findById" and "save" for free.
  
}
