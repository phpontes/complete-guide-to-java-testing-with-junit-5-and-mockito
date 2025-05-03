package com.linkedin.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserRoleTest {

  @ParameterizedTest
  @EnumSource(value = UserRole.class, names = { "ADMIN", "MODERATOR" })
  public void rolesWithWritePermission(UserRole role) {
    assertTrue(role.hasWritePermission());
  }

  @ParameterizedTest
  @EnumSource(value = UserRole.class, names = { "USER", "GUEST" })
  public void rolesWithoutWritePermission(UserRole role) {
    assertFalse(role.hasWritePermission());
  }
}
