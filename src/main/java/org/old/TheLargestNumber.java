package org.old;

public class TheLargestNumber {
  public static long getMaxNumber(long num) {
    // write code here
    if (num == 0) {
      return 0;
    }
    if (String.valueOf(num).length() == 1) {
      return num;
    }
    char[] numCharArray = String.valueOf(num).toCharArray();
    int[] numIntArray = new int[numCharArray.length];
    for (int i = 0; i < numIntArray.length; i++) {
      numIntArray[i] = Character.getNumericValue(numCharArray[i]);
    }
    int temp = 0;
    boolean hasChanged = true;
    while (hasChanged) {
      hasChanged = false;
      for (int i = 0; i < numIntArray.length - 1; i++) {
        if (numIntArray[i] < numIntArray[i+1]) {
          hasChanged = true;
          temp = numIntArray[i];
          numIntArray[i] = numIntArray[i + 1];
          numIntArray[i + 1] = temp;
        }
      }
    }
    StringBuilder stringBuilder = new StringBuilder();
    for (int numInArray : numIntArray) {
      stringBuilder.append(numInArray);
    }
    return Long.parseLong(stringBuilder.toString());
  }
}
