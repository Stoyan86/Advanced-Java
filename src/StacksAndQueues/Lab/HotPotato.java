package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().split("\\s+");
        ArrayDeque<String> childrenQueue = new ArrayDeque<>();
        int turns = Integer.parseInt(scanner.nextLine());
        for (String s : input) {
            childrenQueue.offer(s);
        }

        while (childrenQueue.size() > 1) {
            for (int turn = 1; turn < turns; turn++) {
                String firstChild = childrenQueue.poll();
                childrenQueue.offer(firstChild);

            }
            System.out.println("Removed " + childrenQueue.poll());
        }
        System.out.println("Last is " + childrenQueue.poll());
    }
}