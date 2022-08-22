package aug0608;

import java.util.Arrays;
public class NextBiggerNumber {
  public static int getNextBiggerNumber(int n) {
    // write code here
    String string = String.valueOf(n);
    for (int i = string.length() - 1; i >= 0; i--) {
      for (int j = i - 1; j >= 0; j--) {
        if (string.charAt(i) > string.charAt(j)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(string.substring(0, j)).append(string.charAt(i));
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append(string.substring(j, i));
          if (i < string.length() - 1) {
            stringBuilder2.append(string.substring(i + 1));
          }
          char[] charArray = stringBuilder2.toString().toCharArray();
          Arrays.sort(charArray);
          for (char element : charArray) {
            stringBuilder.append(element);
          }
          return Integer.parseInt(stringBuilder.toString());
        }
      }
    }
    return -1;
  }
}