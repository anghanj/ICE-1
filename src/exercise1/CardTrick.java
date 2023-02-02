package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author anghanj
 * @author Jonty Anghan Feb 01, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        System.out.println("Pick a card (value between 1 and 13)");
        int value = scanner.nextInt();
        System.out.println("Pick a suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs)");
        int suit = scanner.nextInt();

        boolean a = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == value && hand[i].getSuit().equals(Card.SUITS[suit - 1])) {
                a = true;
                break;
            }
        }

        if (a) {
            printInfo();
        } else {
            System.out.println("The card was not found in the hand");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Jonty Anghan Feb 01, 2023 
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Jonty Anghan, but you can call me Jonty.");
        System.out.println();
        
        System.out.println("I am now studying in the course software development.");
        System.out.println();
        System.out.println("-- I am a fond of marvel movies");
        
        System.out.println("My hobbies:");
        System.out.println("-- Travelling");
        System.out.println("-- Photography");

        System.out.println();
    }

}
