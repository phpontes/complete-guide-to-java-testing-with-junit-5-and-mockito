package com.linkedin.app;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserNotificationServiceTest {

    @Mock
    private EmailService emailService;

    @Mock
    private Logger logger;

    @InjectMocks
    private UserNotificationService underTest;

    private static final String EMAIL = "test@example.com";
    private static final String MESSAGE = "Hello, User!";

    @Test
    void notifyUser() throws EmailException {
        underTest.notifyUser(EMAIL, MESSAGE);

        verify(emailService).sendEmail(EMAIL, "Notification", MESSAGE);
        verify(logger).info("Attempting to send notification to " + EMAIL);
        verify(logger).info("Notification sent to " + EMAIL);
    }

    @Test
    void notifyUser_EmailException() throws EmailException {
        doThrow(new EmailException("Email sending failed"))
            .when(emailService).sendEmail(EMAIL, "Notification", EMAIL);

        underTest.notifyUser(EMAIL, MESSAGE);
        verify(emailService).sendEmail(EMAIL, "Notification", MESSAGE);
        verify(logger).info("Attempting to send notification to " + MESSAGE);
        verify(logger).log(eq(Level.SEVERE), eq("Failed to send email to " + EMAIL),
            any(EmailException.class));
    }
}