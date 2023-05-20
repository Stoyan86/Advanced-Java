package StacksAndQueues.Exersices;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int countElements = Integer.parseInt(input[0]);
        int popElements = Integer.parseInt(input[1]);
        int checkElement = Integer.parseInt(input[2]);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < countElements; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < popElements; i++) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println(0);
        } else if (stack.contains(checkElement)){
            System.out.println(true);
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
