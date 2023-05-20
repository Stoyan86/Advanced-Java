package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> urlsStack = new ArrayDeque<>();
        ArrayDeque<String> urlsQueue = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (urlsStack.size() > 1) {
                    urlsQueue.push(urlsStack.pop());
                    System.out.println(urlsStack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")){
                if (urlsQueue.size()>0){
                    String forwardPage = urlsQueue.pollFirst();
                    urlsStack.push(forwardPage);
                    System.out.println(forwardPage);
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                urlsStack.push(input);
                urlsQueue.clear();
                System.out.println(urlsStack.peek());
            }
            input = scanner.nextLine();
        }
    }
}
