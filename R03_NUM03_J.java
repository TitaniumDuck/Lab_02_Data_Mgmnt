// Rule 03 - Numeric Types and Operations (NUM)
// Part NUM03-J - Use Integer Types that can Fully Represent the Possible Range of Unsigned Data

publuc static int getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}
