package org.old;

public class WordsLength {
  public static int getWordsLength(String[] words) {
    // write code here
    int sum = 0;
    for (String word : words) {
      if (word.contains("a") && !word.contains("z")) {
        sum += word.length();
      }
    }
    return sum;
  }
}