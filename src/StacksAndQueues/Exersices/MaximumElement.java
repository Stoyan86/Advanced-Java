package StacksAndQueues.Exersices;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = scanner.nextInt();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < countCommands; i++) {
            int command = scanner.nextInt();
            if (command == 1){
                stack.push(scanner.nextInt());
            } else if (command == 2){
                stack.pop();
            } else if (command == 3){
                System.out.println(Collections.max(stack));
            }
        }
    }
}
