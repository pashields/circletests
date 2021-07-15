package com.circleci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ATest {

  @Test
  public void test() {
    assertEquals(1, 1);
    assertEquals("a", "a");
  }

  @Test
  public void test2() {
    assertEquals(1l, 1l);
  }

}
