package com.linkedin.app;

import java.util.logging.Logger;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
  private static final Logger logger = Logger.getLogger(TimingExtension.class.getName());

  @Override
  public void afterTestExecution(ExtensionContext context) throws Exception {
    long startTime = context.getStore(ExtensionContext.Namespace.GLOBAL).remove("start_time", long.class);
    long executionTime = System.currentTimeMillis() - startTime;
    logger.info(() -> String.format("Finished execution of test method: %s in %d ms", context.getDisplayName(), executionTime));
  }

  @Override
  public void beforeTestExecution(ExtensionContext context) throws Exception {
    logger.info(() -> String.format("Starting execution of test method: %s", context.getDisplayName()));
    context.getStore(ExtensionContext.Namespace.GLOBAL).put("start_time", System.currentTimeMillis());
  }

}
