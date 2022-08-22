package org.old;

public class AlphabeticalAddition {
  public String addLetters(String... letters) {
    // write code here
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int index = 0;
    for (String letter : letters) {
      index += alphabet.indexOf(letter) + 1;
    }
    index %= 26;
    if (letters.length == 0 || index == 0) {
      return "z";
    }
    return alphabet.substring(index - 1, index);
  }
}