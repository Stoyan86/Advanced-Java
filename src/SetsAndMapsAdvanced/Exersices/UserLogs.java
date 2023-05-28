package SetsAndMapsAdvanced.Exersices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
        while (!input.equals("end")) {
            String ip = input.split("\\s+")[0].split("=")[1];
            String username = input.split("\\s+")[2].split("=")[1];
            if (data.containsKey(username)) {
                Map<String, Integer> currentIps = data.get(username);
                if (currentIps.containsKey(ip)){
                    int count = currentIps.get(ip) + 1;
                    data.get(username).put(ip,count);
                } else {
                    data.get(username).put(ip, 1);
                }
            } else {
                data.put(username, new LinkedHashMap<>());
                data.get(username).put(ip, 1);
            }

            input = scanner.nextLine();
        }

        printOutput(data);

    }

    private static void printOutput(TreeMap<String, LinkedHashMap<String, Integer>> data) {
        for (String username : data.keySet()) {
            System.out.println(username + ": ");
            int countValues = data.get(username).size();
            for (Map.Entry<String, Integer> entry : data.get(username).entrySet()) {
                if (countValues>1){
                    System.out.print(entry.getKey() + " => " + entry.getValue() + ", ");
                    countValues--;
                }else {
                    System.out.println(entry.getKey() + " => " + entry.getValue() + ".");
                }
            }
        }
    }
}
