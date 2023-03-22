import java.util.Scanner;
import java.util.Random;

public class RockPS {

    public static void whoWon(char choice, char choice2) {

        if (choice == choice2)
            System.out.println("\nDraw!");
        else {
            Boolean win = true;
            switch (choice) {
                case 'r':
                    if (choice2 == 'p')
                        win = false;
                    else
                        win = true;

                    break;
                case 'p':
                    if (choice2 == 'r')
                        win = true;
                    else
                        win = false;
                    break;
                case 's':
                    if (choice2 == 'r')
                        win = false;
                    else
                        win = true;
                    break;
                default:
                    System.out.println("\nInvalid Choice...");
                    break;
            }
            if (win)
                System.out.println("\nYou Won! ");
            else
                System.out.println("\nYou Lost!");
        }
        return;

    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        try {

            char choice = ' ';
            int choiceIndex = 2;
            char[] choices = { 'r', 'p', 's' };
            String[] hands = { "Rock", "Paper", "Scissors" };
            int chance;
            char choice2;

            do {
                System.out.println("######################  Welcome to Rock Paper Scissors !###################\n\n");
                System.out.println("Enter 'r' for Rock, 'p' for Paper , 's' for Scissors   'q' to quit");
                System.out.println("Please enter your choice:");
                choice = sc.next().charAt(0);
                if (choice != 'q') {

                    if (choice == 'r')
                        choiceIndex = 0;
                    else if (choice == 'p') {
                        choiceIndex = 1;
                    }
                    chance = rand.nextInt(3);
                    choice2 = choices[chance];
                    whoWon(choice, choice2);
                    System.out.println("Your choice: " + hands[choiceIndex] + "\nComputer's choice: " + hands[chance]);
                    Thread.sleep(4000);
                }

            } while (choice != 'q');
            System.out.println("Exiting....");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {

            sc.close();
        }

    }
}