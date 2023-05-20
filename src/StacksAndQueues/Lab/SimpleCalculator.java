package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque <String> stack = new ArrayDeque<>();
        Collections.addAll(stack, input);
        while (stack.size() > 1){
            int firstNumber = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());
            if (operator.equals("+")){
                int sum = firstNumber + secondNumber;
                stack.push(String.valueOf(sum));
            } else {
                int sum = firstNumber - secondNumber;
                stack.push(String.valueOf(sum));
            }
        }
        System.out.println(stack.pop());
    }
}
