package org.old;

public class BitsToInteger {
  public static int reverseBitsToInteger(int number) {
    // write code here
    //make binary string, then char array
    StringBuilder stringBuilder = new StringBuilder();
    while (number > 0) {
      stringBuilder.append(number % 2);
      number /= 2;
    }
    char[] numberBinary = stringBuilder.toString().toCharArray();
    //make decimal from binary
    int numberDecimal = 0;
    int countPower = 0;
    for (int i = numberBinary.length - 1; i >= 0; i--) {
      numberDecimal += Character.getNumericValue(numberBinary[i]) * Math.pow(2, countPower);
      countPower++;
    }
    return numberDecimal;
  }
}
