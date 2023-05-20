package StacksAndQueues.Exersices;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque <Integer> numbers = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String s : input) {
            numbers.push(Integer.parseInt(s));
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
