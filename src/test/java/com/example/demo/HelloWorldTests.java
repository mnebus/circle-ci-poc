package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldTests {

	private HelloWorld helloWorld;

	@BeforeEach
	void beforeEach() {
		helloWorld = new HelloWorld();
	}

	@Test
	public void saysHello() {
		Assertions.assertEquals("Hello, World2!",helloWorld.sayHello());
	}

}
