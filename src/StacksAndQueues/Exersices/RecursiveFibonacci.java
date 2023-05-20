package StacksAndQueues.Exersices;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFibonacci(n));
    }

    private static long getFibonacci(int n) {
        if (n<=2){
            return  1;
        } else {
            return getFibonacci(n-1) + getFibonacci(n-2);

        }
    }
}
