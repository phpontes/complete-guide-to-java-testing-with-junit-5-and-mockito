package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

  // mock() vs @Mock

  @Mock
  private UserRepository userRepositoryMock;

  @InjectMocks
  private UserService underTest;

  @Test
  public void findUserById() {

    User mockUser = new User("1", "John Doe");
    when(userRepositoryMock.findById("1")).thenReturn(mockUser);

    User result = underTest.findUserById("1");

    assertEquals(mockUser, result);
    verify(userRepositoryMock).findById("1");
  }

  @Test
  public void findUserById_nonExistent() {
    when(userRepositoryMock.findById("3")).thenReturn(null);
    assertNull(underTest.findUserById("3"));
  }
}
