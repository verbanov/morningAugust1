package org.old;

public class Factorial {
  public int getFactorial(int number) {
    //write your code here
    if (number == 0) {
      return 1;
    }

    return getFactorial(number - 1) * number;
  }
}