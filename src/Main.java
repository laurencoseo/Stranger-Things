import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        Player[] playerOptions = new Player[4];

        /*  ********** MEET YOUR PLAYERS *************** */

        // Eleven is a strong attacker, but a bad healer
        playerOptions[0] = new Player("Eleven", 200,
                55, 1, 20);

        // Dustin is a bad attacker, but can heal fast
        playerOptions[1] = new Player("Dusty-bun", 200,
                20, 2, 25);

        // Steve is good with a bat, and can heal many times
        playerOptions[2] = new Player("Steve \"The Hair\" Harrington", 200,
                40, 5, 10);

        // Max is a tough one and can attack and heal well
        playerOptions[3] = new Player("Max the Zoomer", 200,
                30, 3, 15);

        // Nancy is fucking cool
        playerOptions[3] = new Player("Nancy Wheeler", 200,
                40, 1, 20);

        /*  ********** MEET YOUR OPPONENT *************** */

        Player monster = new Player("Demodog", 200,
                25, 0, 0);


        boolean running = true;

        System.out.println("Welcome to Hawkins!");

        // Runs forever until you kill it

//        while(running) {
//
//        }

        // TODO: FOR GUI:

        // TODO: Figure out how to match a click of a button to an action

        // TODO: Select player

        // TODO: Select action


        int playerNum = in.nextInt();

        Player chosenFighter = playerOptions[playerNum];

        while(running) {
            System.out.println("Time to defeat the Demodog!");
            System.out.println("1:Attack 2:Heal 3:Run");
            System.out.println("Choose your action:");
            int playerAction = in.nextInt();

            switch (playerAction) {
                case 1:
                    chosenFighter.attack();
                case 2:
                    chosenFighter.heal();
                case 3:
                    chosenFighter.run();
                default:
                    System.out.println("Please type 1, 2, or 3.");
            }

            // You lose if you are out of health
            if (chosenFighter.getHealth() <= 0) {
                System.out.println("You lose!");
            }

            // You win if the monster is out of health
            if (monster.getHealth() <= 0) {
                System.out.println("You win! You\'re a hero");
            }

            System.out.println("Play again? (Y/N)");
            String playAgain = in.next();
            if (playAgain.equals("N")) {
                break;
            }

        }




    }
}
