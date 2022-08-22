package aug0408;

public class RowWeights {
  public static int[] getTotalWeight(int[] weights) {
    // write code here
    if (weights.length == 0) {
      return new int[]{0,0};
    }
    if (weights.length == 1) {
      return new int[] {weights[0], 0};
    }
    int[] totalWeight = new int[2];
    for (int i = 0; i < weights.length; i++) {
      if (i % 2 == 0) {
        totalWeight[0] += weights[i];
      } else {
        totalWeight[1] += weights[i];
      }
    }
    return totalWeight;
  }
}
