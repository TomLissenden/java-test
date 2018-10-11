package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Add test cases for your coding test in here. All tests must use the Junit test framework.
 */
public class AdderTest {

  @Test
  public void testAddNothing() {
    assertEquals(0, Adder.add());
  }

  @Test
  public void testAddOneNumber() {
    assertEquals(27, Adder.add(27));
  }

  @Test
  public void testAddTwoNumbers() {
    assertEquals(36, Adder.add(27, 9));
  }

  @Test
  public void testAddThreeNumbers() {
    assertEquals(39, Adder.add(27, 9, 3));
  }
}
