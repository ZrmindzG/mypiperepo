package com.utilities;

import org.testng.annotations.Test;

public class ReportingTest {

  @Test
  public void OnTestfailureTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void OnTestsuccessTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void onFinishTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void onStartofTCTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void onTestskippedTest() {
    throw new RuntimeException("Test not implemented");
  }
}
