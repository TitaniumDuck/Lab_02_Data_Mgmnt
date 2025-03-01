// Rule 9 - Locking (LCK)
// Part LCK01-J - Do Not Synchronize on Objects that may be Reused

private int count = 0;
private final Integer Lock = new Integer(count);

public void doSomething() {
  synchronized (Lock) {
    count++;
    // ...
  }
}
