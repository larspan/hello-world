package com.pan.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldShould {

	@Test
	public void test() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello world", helloWorld.sayHello());
	}

}
