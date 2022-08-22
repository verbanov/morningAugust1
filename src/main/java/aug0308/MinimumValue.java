package aug0308;

import java.util.Arrays;

public class MinimumValue {
  public static int getMinValue(int[] nums) {
    // write code here
    int[] array = nums;
    Arrays.sort(array);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(array[0]);
    for (int i = 1; i < array.length; i++) {
      if (array[i] != array[i - 1]) {
        stringBuilder.append(array[i]);
      }
    }
    return Integer.parseInt(stringBuilder.toString());
  }
}
