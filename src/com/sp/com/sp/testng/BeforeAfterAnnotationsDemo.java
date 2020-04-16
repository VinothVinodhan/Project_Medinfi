package com.sp.com.sp.testng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeforeAfterAnnotationsDemo {
  @Test(priority=1)
  public void f1() {
	  System.out.println("this is the f1 Test method");
  }
  @Test(priority=2)
  public void f2() {
	  System.out.println("this is the f2 Test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method execution");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class method execution");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class method execution");
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
