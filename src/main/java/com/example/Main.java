package com.example;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main {

  public static void main(String[] args) {

    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

    Greeting greeting2 = new Greeting() {
      @Override
      public void sayHello() {
        System.out.println("Hello World");
      }
    };
    greeting2.sayHello();

    Greeting greeting3 = () -> System.out.println("Hello World");
    greeting3.sayHello();

    IntBinaryOperator calculator = (x, y) -> {
      Random random = new Random();
      int randomNumber = random.nextInt(50);
      System.out.println(randomNumber);
      return x * y + randomNumber;
    };

    System.out.println(calculator.applyAsInt(1, 2));

    BiFunction<String, String, String> concatenate = ( a,  b) -> a + " " + b;
    System.out.println(concatenate.apply("Hi", "Sunshine"));

  }

}
