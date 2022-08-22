package aug0408;

public class RemoveChars {
  public static String removeChars(String string) {
    // write code here
    String temp = string.substring(1);
    return temp.substring(0, temp.length() - 1);
  }
}
