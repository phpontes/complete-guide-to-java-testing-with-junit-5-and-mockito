package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class SystemInfoTest {

  private final SystemInfo systemInfo = new SystemInfo();

  @Test
  @EnabledOnOs(OS.WINDOWS)
  void getOSNameOnWindows() {
    String osName = systemInfo.getOSName();
    assertTrue(osName.contains("Windows"), "OS name should contain 'Windows'");
  }

  @Test
  @EnabledOnOs(OS.LINUX)
  void getOSNameOnLinux() {
    String osName = systemInfo.getOSName();
    assertTrue(osName.contains("Linux"), "OS name should contain 'Linux'");
  }

  @Test
  @EnabledOnJre(JRE.JAVA_11)
  void getJavaVersionOnJava11() {
    String javaVersion = systemInfo.getJavaVersion();
    assertTrue(javaVersion.startsWith("11"), "Java version should start with '11'");
  }

  @Test
  @EnabledOnOs(OS.MAC)
  @EnabledOnJre(JRE.JAVA_17)
  void getOSNameOnMacWithJava17() {
    String osName = systemInfo.getOSName();
    String javaVersion = systemInfo.getJavaVersion();
    assertTrue(osName.contains("Mac"), "OS name should contain 'Mac'");
    assertTrue(javaVersion.startsWith("17"), "Java version should start with '17'");
  }
}