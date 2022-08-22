package aug0608;

import java.util.ArrayList;

public class CubicNumbers {
  public static String findCubicNumbers(String string) {
    // write code here
    StringBuilder stringBuilder = new StringBuilder();
    ArrayList<Integer> numbers = new ArrayList<>();
    int index = 0;
    for (int i = 0; i < string.length(); i++) {
      if (Character.isDigit(string.charAt(i))) {

        stringBuilder.append(string.charAt(i));
        index++;
        if (index == 3 || i == string.length() - 1) {
          if (checkCube(stringBuilder.toString())) {
            numbers.add(Integer.parseInt(stringBuilder.toString()));
            index = 0;
            stringBuilder.setLength(0);
          } else {
            index = 0;
            stringBuilder.setLength(0);
          }
        }
      } else {
        if (checkCube(stringBuilder.toString())) {
          numbers.add(Integer.parseInt(stringBuilder.toString()));
          index = 0;
          stringBuilder.setLength(0);
        } else {
          index = 0;
          stringBuilder.setLength(0);
        }
      }
    }
    stringBuilder.setLength(0);
    if (numbers.size() == 0) {
      return "Unlucky";
    }
    int sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      stringBuilder.append(numbers.get(i)).append(" ");
      sum += numbers.get(i);
    }
    stringBuilder.append(sum).append(" ").append("Lucky");
    return stringBuilder.toString();
  }

  public static boolean checkCube(String string) {
    if (string == null || string == "") {
      return false;
    }
    String [] stringArray = string.split("");
    int sum = 0;
    for (String number : stringArray) {
      sum += Math.pow(Integer.parseInt(number), 3);
    }
    return (sum == Integer.parseInt(string));
  }
}



