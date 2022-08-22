package org.old;

public class Haystack {
  public static String findNeedle(Object[] haystack) {
    // write code here
    for (int i = 0; i <= haystack.length; i++) {
      if (haystack[i] instanceof String) {
        if (haystack[i] == "needle") {
          return "found the needle at position " + i;
        }
      }
    }
    return "";
  }
}
