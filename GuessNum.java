import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc  = new Scanner(System.in);
        String choice;
        int choiceNum;
        Boolean repeat = false;

        do {
            System.out.println("Welcome to Guess the random number game: ");
            int number = random.nextInt(100);

            System.out.println("Enter your guess: \t\t\t\tor enter (q) to exit");
            choice = sc.next();
            if (choice.charAt(0)!='q') {
                choiceNum = Integer.parseInt(choice);
                while (choiceNum != number && choice.charAt(0) != 'q') {
                    if (choiceNum < number) {
                        System.out.println("Too low");
                    }
                    else{
                        System.out.println("Too high");
                    }
                    System.out.println("Enter your choice again");
                    choiceNum = sc.nextInt();
    
                }
                System.out.println("Correct! choice");
                System.out.println("Do you want to play again? (y/n)");
                choice = sc.next();
            }

            if (choice.charAt(0) == 'q') {
                repeat = false;
            }
            if (choice.charAt(0) == 'n')
            {
                repeat = false;
            }

        } while (repeat);
        sc.close();

    }
}
