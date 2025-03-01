// Rule 49 - Miscellaneous (MSC)
// Part MSC02-J - Generate Strong Random Numbers

import java.until.Random;
// ...

Random number = new Random(123L);
// ...
for(int i = 0; i < 20; i++) {
  // Generate another random integer in the range [0, 20]
int n = number.nextInt(21);
  System.out.println(n);
}
