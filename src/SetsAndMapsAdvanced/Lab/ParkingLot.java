package SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashSet <String> parkingLot = new LinkedHashSet<>();
        while (!input.equals("END")){
            String direction = input.split(", ")[0];
            String carNumber = input.split(", ")[1];
            if (direction.equals("IN")){
                parkingLot.add(carNumber);
            } else if (direction.equals("OUT")) {
                parkingLot.remove(carNumber);
            }
            input = scanner.nextLine();
        }
        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else{
            for (String car : parkingLot) {
                System.out.println(car);

            }
        }
    }
}
