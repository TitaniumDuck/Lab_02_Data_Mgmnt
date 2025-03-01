// Rule 49 - Miscellaneous (MSC)
// Part MSC02-J - Generate Strong Random Numbers

import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
// ...

public static void main (String args[]) {
SecureRandom number = new SecureRandom();
for(int i = 0; i < 20; i++) {
  // Generate another random integer in the range [0, 20]
int n = number.nextInt(21);
  System.out.println(n);
}
}
