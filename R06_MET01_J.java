// Rule 06 - Methods (MET)
// Part MET01-J - Never Use Assertions to Validate Argument Methods

public static int getAbsAdd(int x, int y) {
  
  if(x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
    throw new IllegalArgumentException();
}
int absX = Math.abs(x);
int absY = Math.abs(y);

if(absX > Integer.MAX_VALUE - absY) {
  throw new IllegalArgumentException();
}

return absX + absY;
}
