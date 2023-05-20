package StacksAndQueues.Exersices;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countElements = scanner.nextInt();
        int removeElements = scanner.nextInt();
        int checkElement = scanner.nextInt();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < countElements; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < removeElements; i++) {
            if (!queue.isEmpty()){
                queue.poll();
            }
        }
        if (queue.isEmpty()){
            System.out.println(0);
        } else if (queue.contains(checkElement)){
            System.out.println(true);
        } else {
            System.out.println(Collections.min(queue));
        }
    }
}
