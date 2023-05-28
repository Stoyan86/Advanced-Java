package SetsAndMapsAdvanced.Exersices;

import java.util.*;

public class fixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Map<String, String> nameAndMail = new LinkedHashMap<>();
        while (!name.equals("stop")){
            String email = scanner.nextLine();
            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")){
                nameAndMail.put(name, email);
            }
            name = scanner.nextLine();
        }
        nameAndMail.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
