package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binary = new ArrayDeque<>();
        if (decimal == 0){
            System.out.println(0);

        } else {
            while (decimal != 0){
                binary.push(decimal % 2);
                decimal/=2;
            }
            for (Integer integer : binary) {
                System.out.print(integer);
            }

        }

    }
}
