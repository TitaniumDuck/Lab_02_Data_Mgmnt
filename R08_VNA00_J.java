// Rule 08 - Visibility and Atomicity (VNA)
// Part VNA00-J - Ensure Visibility when Accessing Shared Primitive Variables

final class ControlledStop implements Rannable {
  private boolean done = false;

  @Override public void run() {
    while (!done) {
      try {
        // ...
        Thread.currentThread().sleep(1000) // do something
          } catch(InterruptedException ie) {
        Thread.currentThread().interrupt(); // Reset Interrupt status
      }
    }
  }

publiv void shutdown() {
  done = true;
}
}
