// Rule 04 - Characters and Strings
// Part STR03-J - Do Not Encode Noncharacter Data as a String

BigInteger x = new BigInteger("530500452766");
String s = x.toString(); // Valid Character Data
byte[] byteArray = s.getBytes();
String ns = new String(byteArray);
x = new BigInteger(ns);
