package SetsAndMapsAdvanced.Lab;

import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> guestList = new TreeSet<>();
        String input = scanner.nextLine();
        while (!input.equals("PARTY")){
            guestList.add(input);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("END")){
            guestList.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(guestList.size());
        for (String guest : guestList) {
            System.out.println(guest);
        }

    }
}
