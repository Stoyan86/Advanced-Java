package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> urls = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (urls.size() > 1) {
                    urls.pop();
                    System.out.println(urls.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                urls.push(input);
                System.out.println(urls.peek());
            }
            input = scanner.nextLine();
        }
    }
}
