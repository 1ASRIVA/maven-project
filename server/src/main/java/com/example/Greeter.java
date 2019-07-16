package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greets someone.
   * @param someone the one we are gonna greet
   * @return a greeting
   */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
