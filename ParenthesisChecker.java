import java.util.Stack;

public class ParenthesisChecker {

    public static void checkParens(String inputStr) {
        Stack<Character> stack = new Stack<>();

        for (Character c : inputStr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Unbalanced Parenthesis.");
                    return;
                }

                char removed = stack.pop();

                if ((c == ')' && removed != '(') ||
                    (c == '}' && removed != '{') ||
                    (c == ']' && removed != '[')) {
                    System.out.println("Unbalanced Parenthesis.");
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Unbalanced Parenthesis.");
        } else {
            System.out.println("All parentheses are balanced.");
        }
    }
}
