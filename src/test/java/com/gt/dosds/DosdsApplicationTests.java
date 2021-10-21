package com.gt.dosds;

import com.gt.dosds.model.bar.Bar;
import com.gt.dosds.model.foo.Foo;
import com.gt.dosds.repo.bar.BarRepository;
import com.gt.dosds.repo.foo.FooRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DosdsApplicationTests {

	@Autowired
	FooRepository fooRepository;

	@Autowired
	BarRepository barRepository;
	
	@Test
	void contextLoads() {

		Foo foo = new Foo("Primer Foo");

		fooRepository.save(foo);

		Bar bar = new Bar("El bar");

		barRepository.save(bar);

		System.out.println("q foo" + fooRepository.count());
		System.out.println("q bar" + barRepository.count());

	}

}
