package org.old;

public class MultiplesOfNumber {
  public static int[] getMultiples(int multiples, int number) {
    // write code here
    if (multiples == 0) {
      return new int[0];
    }
    int[] result = new int[multiples];
    for (int i = 0; i < multiples; i++) {
      result[i] = number * (i + 1);
    }
    return result;
  }
}
