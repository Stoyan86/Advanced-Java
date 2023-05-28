package SetsAndMapsAdvanced.Lab;


import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, Double[] > studentsGrades = new TreeMap<>();
        DecimalFormat df = new DecimalFormat("#.#################################");
        for (int i = 0; i < countOfStudents; i++) {
            String nameOfStudent = scanner.nextLine();
            String[] inputGrades = scanner.nextLine().split("\\s+");
            Double [] grades = new Double[inputGrades.length];
            for (int currentGrade = 0; currentGrade < inputGrades.length; currentGrade++) {
                grades[currentGrade] = Double.parseDouble(inputGrades[currentGrade]);
            }
            studentsGrades.put(nameOfStudent, grades);
        }
        for (String student : studentsGrades.keySet()) {
            double avgGrade = 0;
            for (double grade : studentsGrades.get(student)) {
                avgGrade+= grade;
            }
            avgGrade /= studentsGrades.get(student).length;
            System.out.printf("%s is graduated with %s%n", student, df.format(avgGrade));
        }
    }
}
