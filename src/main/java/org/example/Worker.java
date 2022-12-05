package org.example;

import java.util.logging.Logger;

public class Worker implements Runnable {

  private final Task task;

  public Worker(final Task task) {
    this.task = task;
  }

  @Override
  public void run() {
    Logger.getLogger(Thread.currentThread().getName(), task.toString());
    try {
      Thread.sleep(task.getTimeMs());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
