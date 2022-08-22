package aug08;

import java.text.DecimalFormat;

public class TruncNumbers {
  public static double truncateToHundredth(double num) {
    // write code here
    String result = String.valueOf(num);
    result = result.substring(0, result.indexOf(".")) + "."
            + result.substring(result.indexOf(".")
            + 1, result.indexOf(".") + 3);
    return Double.valueOf(result);
  }
}
