package aug1908Stack;

import java.util.Stack;

public class ValidParentheses {
  public static boolean isValidParentheses(String string) {
    // write code here
    Stack<Character> charStack = new Stack<>();
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == '(') {
        charStack.push(string.charAt(i));
      }
      if (string.charAt(i) == ')') {
        if (charStack.size() == 0) {
          return false;
        }
        charStack.pop();
      }
    }
    return charStack.size() == 0;
  }
}
