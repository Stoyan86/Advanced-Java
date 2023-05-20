package StacksAndQueues.Lab;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().split("\\s+");
        PriorityQueue<String> childrenQueue = new PriorityQueue<>();
        int turns = Integer.parseInt(scanner.nextLine());
        Collections.addAll(childrenQueue, input);
        int cycle = 1;
        while (childrenQueue.size() > 1) {
            for (int turn = 1; turn < turns-1; turn++) {
                String firstChild = childrenQueue.poll();
                childrenQueue.offer(firstChild);
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + childrenQueue.peek());
            } else {
                System.out.println("Removed " + childrenQueue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + childrenQueue.poll());
    }

    private static boolean isPrime(int cycle) {
        if (cycle == 1){
            return false;
        }
        for (int i = 2; i < cycle ; i++) {
            if (cycle % i == 0){
                return false;
            }
        }
        return true;
    }
}