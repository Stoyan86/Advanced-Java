package SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> numbersWithCounts = new LinkedHashMap<>();
        for (double number : numbers) {
            if (numbersWithCounts.containsKey(number)){
                int count = numbersWithCounts.get(number)+1;
                numbersWithCounts.put(number, count);
            } else {
                numbersWithCounts.put(number, 1);
            }
        }
        for(Double number : numbersWithCounts.keySet()){
            System.out.printf("%.1f -> %d%n", number, numbersWithCounts.get(number));
        }
    }
}
