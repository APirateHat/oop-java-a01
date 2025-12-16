import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    private enum Move {ROCK, SCISSOR, PAPER}

    private String avatarName = "Shrek";
    private int avatarScore = 0;
    private int playerScore = 0;
    private String[] graphics = {"✊", "✀", "✋"};
    private String[] type = {"rock", "scissor", "paper"};

    private Scanner scanner;

    public RockPaperScissor(Scanner newScanner) {
        this.scanner = newScanner;
    }

    public void play(){
        String input;
        welcomeMessage();

        do
        {
            printScore(playerScore, avatarScore);
            printOptions();
            input = scanner.nextLine();
            switch(input){
                case "r":
                    calculateWinner(Move.ROCK);
                    break;
                case "p":
                    calculateWinner(Move.PAPER);
                    break;
                case "s":
                    calculateWinner(Move.SCISSOR);
                    break;
                case "q":
                    break;
                default:
                    System.out.println("Not a valid choice!");
            }
        }
        while (!input.equals("q"));
    }

    private void welcomeMessage(){
        System.out.println("Welcome to a game of rock ✊, scissor ✀, paper ✋!");
        System.out.println("You will play against " + avatarName + " and we keep score.");
    }

    private void printScore(int score1, int score2){
        System.out.println("Score: You " + score1 + " - " + avatarName + " " + score2);
    }

    private void printOptions(){
        String rock = type[0] + " " + graphics[0] + " [r],";
        String scissor = type[1] + " " + graphics[1] + " [s],";
        String paper = type [2] +  " " + graphics[2] + " [p]";
        System.out.println("Select " + rock + " " + scissor + " " + paper + " or quit [q]");
    }

    private void calculateWinner(Move playerMove){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        Move avatarMove = Move.values()[randomNumber];
        int playerIndex = playerMove.ordinal();
        int avatarIndex = avatarMove.ordinal();
        String youDid = "You did " + type[playerIndex] + " " +graphics[playerIndex];
        String avatarDid = avatarName + " did " + type[avatarIndex] + " " + graphics[avatarIndex];
        String combinedString = youDid + " and " + avatarDid + ". ";


        if (playerMove == avatarMove){
            System.out.println(combinedString + "You are equal in strength! No points!");
        }
        else if (playerMove == Move.ROCK && avatarMove == Move.PAPER){
            avatarScore += 1;
            System.out.println(combinedString + avatarName + " wins by totally obliterating your paper with a rock!");
        }
        else if (avatarMove == Move.ROCK && playerMove == Move.PAPER){
            playerScore += 1;
            System.out.println(combinedString + "You crushed Shrek's flimsy paper!");
        }
        else if (playerMove == Move.SCISSOR && avatarMove == Move.PAPER){
            playerScore += 1;
            System.out.println(combinedString + " You win by cutting Shrek's paper into tiny, tiny pieces!");
        }
        else if (avatarMove == Move.SCISSOR && playerMove == Move.PAPER){
            avatarScore += 1;
            System.out.println(combinedString + avatarName + " wins with a quick and sharp cut through your sad and weak paper.");
        }
        else if (avatarMove == Move.SCISSOR && playerMove == Move.ROCK){
            playerScore += 1;
            System.out.println(combinedString + " You win by finding the strongest diamond scissors that cuts rock!");
        }
        else if (playerMove == Move.SCISSOR && avatarMove == Move.ROCK){
            avatarScore += 1;
            System.out.println(combinedString + avatarName + " wins merely with his strong grip and regular scissors.");
        }
    }

}
