// Rule 10 - Thread APIs (THI)
// Part THI00-J - Do Not Invoke Thread.run()

public final class Foo implements Runnable {
  @Override public void run() {
    // ...
  }

public static void main(String[] args) {
  Foo foo = new Foo();
  new Thread(foo).start();
}
}
