package com.madbadanddangerous.demo.foo;

import com.madbadanddangerous.demo.messages.FooMessage;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 * You can put business logic here. In this case it's more of a placeholder.
 */
@Service
public class FooServiceImpl implements FooService {

  private final FooRepository fooRepo;

  public FooServiceImpl(FooRepository fooRepo) {
    this.fooRepo = fooRepo;
  }

  @Override
  public FooMessage getFoo(Integer id) {
    Optional<Foo> maybeFoo = fooRepo.findById(id);
    if (maybeFoo.isPresent()) {
      return maybeFoo.get().toFooMessage();
    } else {
      throw new RuntimeException("not found");
    }
  }

  @Override
  public FooMessage putFoo(FooMessage foo) {
    Foo response = fooRepo.save(Foo.Util.fromFooMessage(foo));
    return response.toFooMessage();
  }

}
