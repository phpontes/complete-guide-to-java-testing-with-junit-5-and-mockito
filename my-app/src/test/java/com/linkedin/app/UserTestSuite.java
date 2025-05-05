package com.linkedin.app;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
  UserRegistrationTest.class,
  UserLoginTest.class
})
//@SelectPackages("com.linkedin.app")
public class UserTestSuite {
  
}
