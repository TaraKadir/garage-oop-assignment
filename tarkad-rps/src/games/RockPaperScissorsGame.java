package games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    Player player;
    Fist aIFist;

    public RockPaperScissorsGame(String playerName, int playerScore) {
        this.player = new Player(playerName, playerScore);
        this.aIFist = new Fist();
    }
    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame("Marcus", 0);
        game.playGame();
    }

    void playGame(){
        //kan inte få till string med math random, kollade andra metoder.. kan du visa mig?
        Scanner scanner = new Scanner(System.in);
        String[] RockPaperScissor = {"Rock", "Paper", "Scissor"}; //detta är en array
        String robotPlay = RockPaperScissor[new Random().nextInt(RockPaperScissor.length)]; //length betyder att den
        // ska ta allt som är inne i arrayen (rock, paper, scissor)
        String userPlay;
        while (true) {
            System.out.println("Welcome to Rock, Paper, Scissors!" + "\nPlease enter your move Rock, Paper or Scissor");
            userPlay = scanner.nextLine();
            if (userPlay.equalsIgnoreCase("Rock") || userPlay.equalsIgnoreCase("Paper") || userPlay.equalsIgnoreCase("Scissor")) {
                break;
            }
            System.out.println(userPlay + " Is not a valid move");
        }

        System.out.println("Robot played: " + robotPlay);
        if (userPlay.equalsIgnoreCase(robotPlay)) {
            System.out.println("The game was a tie");
        } else if (userPlay.equalsIgnoreCase("Rock")) {
            if (robotPlay.equalsIgnoreCase("Paper")) {
                System.out.println("You lose!");
            } else if (robotPlay.equalsIgnoreCase("Scissor")) {
                System.out.println("You win!");
            }

            //@FIXME: check IntelliJ's suggestion for the else condition and make adjustments
            else if (userPlay.equalsIgnoreCase("Paper")) {
                if (robotPlay.equalsIgnoreCase("Rock")) {
                    System.out.println("You win!");
                } else if (robotPlay.equalsIgnoreCase("Scissor")) {
                    System.out.println("You lose!");

                }
            }
        } else if (userPlay.equalsIgnoreCase("Scissor")) {
            if (robotPlay.equalsIgnoreCase("Paper")) {
                System.out.println("You win!");
            } else if (robotPlay.equalsIgnoreCase("Scissor")) {
                System.out.println("You lose!");

            }
        }

    }

}