package SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Voina_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set <Integer> deckOne = new LinkedHashSet<>();
        Set<Integer> deckTwo = new LinkedHashSet<>();
        String[] playerOneCards = scanner.nextLine().split("\\s+");
        for (String card : playerOneCards) {
            deckOne.add(Integer.parseInt(card));
        }
        String[] playerTwoCards = scanner.nextLine().split("\\s+");
        for (String card : playerTwoCards) {
            deckTwo.add(Integer.parseInt(card));
        }
        boolean gameOver = false;
        for (int i = 0; i < 50; i++) {
            fightTurn(deckOne, deckTwo);
            if (deckOne.isEmpty() || deckTwo.isEmpty()){
                gameOver = true;
                break;
            }
        }
        if (deckOne.size()> deckTwo.size()) {
            System.out.println("First player win!");
        } else  if (deckTwo.size()> deckOne.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }

    }

    private static void fightTurn(Set<Integer> deckOne, Set<Integer> deckTwo) {
        int firstPlayerCard = deckOne.iterator().next();
        deckOne.remove(firstPlayerCard);
        int secondPlayerCard = deckTwo.iterator().next();
        deckTwo.remove(secondPlayerCard);
        if (firstPlayerCard > secondPlayerCard){
            deckOne.add(firstPlayerCard);
            deckOne.add(secondPlayerCard);
        } else if (secondPlayerCard > firstPlayerCard) {
            deckTwo.add(firstPlayerCard);
            deckTwo.add(secondPlayerCard);
        }
    }
}
