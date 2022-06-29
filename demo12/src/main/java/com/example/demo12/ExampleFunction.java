package com.example.demo12;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ExampleFunction implements Function<ExampleFunction.MyPojo, String> {

    @Override
    public String apply(MyPojo myPojo) {
        // Do something in your lambda function here
        return myPojo.getExampleField().toUpperCase();
    }

    @Data
    public class MyPojo {
        private String exampleField;
    }
}