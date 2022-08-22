package org.old;

public class FibonacciSequence {
  public int getFibonacciNumber(int n) {
    //write your code here
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 1;
    } else if (n == 3) {
      return 2;
    }
    int fibonacciPrev  = getFibonacciNumber(n-2);
    return getFibonacciNumber(n - 1) + fibonacciPrev;
  }
}
