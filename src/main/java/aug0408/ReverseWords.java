package aug0408;

public class ReverseWords {
  public static String reverseWords(final String string) {
    // write code here
    if (string == null) {
      return "";
    }
    if (string.length() == 1) {
      return string;
    }
    int spaces = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == ' '){
        spaces++;
      }
    }
    if (string.length() == spaces) {
      return string;
    }
    StringBuilder stringBuilder = new StringBuilder();
    String[] splittedString = string.split(" ");
    for (int i = 0; i < splittedString.length; i++) {
      stringBuilder.append(splittedString[i]);
      stringBuilder.reverse();
      splittedString[i] = stringBuilder.toString();
      stringBuilder.setLength(0);
    }
    int index = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == ' ') {
        stringBuilder.append(" ");
      } else {
        stringBuilder.append(splittedString[index]);
        i+=splittedString[index].length() - 1;
        index++;

      }
    }
    return stringBuilder.toString();
  }
}

