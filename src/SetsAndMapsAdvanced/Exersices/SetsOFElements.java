package SetsAndMapsAdvanced.Exersices;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOFElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int firstSetSize = Integer.parseInt(input[0]);
        int secondSetSize = Integer.parseInt(input[1]);
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSetSize; i++) {
          firstSet.add(scanner.nextInt());
        }
        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(scanner.nextInt());
        }
        for (Integer integer : firstSet) {
            if (secondSet.contains(integer)){
                System.out.print(integer + " ");
            }
        }
    }
}
