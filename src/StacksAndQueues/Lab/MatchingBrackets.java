package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Integer> indexStack= new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '('){
                indexStack.push(i);
            } else if (ch == ')'){
                int startIndex = indexStack.pop();
                String contents = input.substring(startIndex, i + 1);
                System.out.println(contents);
            }
        }
    }
}
