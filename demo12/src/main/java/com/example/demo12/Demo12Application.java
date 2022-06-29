package com.example.demo12;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Demo12Application {

	public static void main(String[] args) {
		FunctionalSpringApplication.run(Demo12Application.class, args);
	}

	@Bean
	public ExampleFunction exampleFunction() {
		return new ExampleFunction();
	}

	@Bean
	public ExampleConsumer exampleConsumer() {
		return new ExampleConsumer();
	}

	@Bean
	public ExampleSupplier exampleSupplier() {
		return new ExampleSupplier();
	}
}