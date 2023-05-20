package StacksAndQueues.Exersices;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> leftParenthesis = new ArrayDeque<>();
        ArrayDeque<Character> rightParenthesis = new ArrayDeque<>();
        boolean balance = false;
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                leftParenthesis.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                rightParenthesis.offer(c);
            }
        }
        if (leftParenthesis.size() != rightParenthesis.size()) {
            balance = false;
        } else {
            while (!leftParenthesis.isEmpty() && !rightParenthesis.isEmpty()) {
                char left = leftParenthesis.pop();
                char right = rightParenthesis.pop();

                if ((left == '(' && right == ')') || (left == '{' && right == '}') || (left == '[' && right == ']')) {
                    balance = true;
                } else {
                    balance = false;
                    break;
                }
            }
        }
        if (balance) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
