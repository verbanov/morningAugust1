package org.old;

import java.util.List;

public class ListElementsAddition {
  //write your method here
  public int calculateSum(List<Integer> list) {
    Integer sum = 0;
    if (list == null) {
      return 0;
    }
    for (Integer element : list) {
      sum += element;
    }
    return sum;
  }
}
