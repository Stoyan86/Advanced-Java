package SetsAndMapsAdvanced.Lab;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> studentsGrades = new TreeMap<>();
        for (int i = 0; i < numOfStudents; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String nameOfStudents = input[0];
            String grade = input[1];
            if (studentsGrades.containsKey(nameOfStudents)){
                studentsGrades.get(nameOfStudents).add(grade);
            } else {
                studentsGrades.put(nameOfStudents, new ArrayList<>());
                studentsGrades.get(nameOfStudents).add(grade);
            }
        }
        for (Map.Entry<String, ArrayList<String>> name : studentsGrades.entrySet()) {
            double sum = name.getValue().stream().mapToDouble(Double::parseDouble).sum();
            double avgGrade = sum / name.getValue().size();
            System.out.printf("%s -> %s (avg: %.2f)%n", name.getKey(), String.join(" ",name.getValue()), avgGrade);
        }

    }
}
