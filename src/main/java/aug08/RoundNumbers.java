package aug08;

import java.math.MathContext;
import java.text.DecimalFormat;

public class RoundNumbers {
  public static double roundToHundredth(double num) {
    // write code here
    return (double) Math.round(num * 100) / 100;
  }
}