import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    //Constructor method
    public Menu(){

    }

    public void run(){
        String choice;
        RockPaperScissor rps = new RockPaperScissor(scanner);
        printMenu();
        do {
            choice = getChoice().toLowerCase();
            System.out.println("You enterered: " + choice);
            switch (choice) {
                case "1":
                        Avatar.print();
                        break;
                case "2":
                        Today.print();
                        break;
                case "3a":
                        rps.play();
                        //System.out.println("Choice currently not available");
                case "m":
                        printMenu();
                        break;
                case "q":
                    scanner.close();
                    break;
            }
        }
        while (!choice.equals("q"));
        
    }

    public String getChoice(){
        System.out.print("Enter your choice: ");
        String input = scanner.nextLine();

        return input;
    }

    public void printMenu(){
        String menu = """
                 -----------------
                | 1) Print my avatar
                | 2) Print time and date
                | 3A) Rock Paper Scissor
                | m) Print menu
                | qQ) Quit
                 -----------------
                """;
        System.out.println(menu);
    }

    // private void makeDashes(int dashAmount){
    //     String dashes = "";
    //     for (int i = 0; i < dashAmount; i++){
    //         dashes += "-";
    //     }
    //     System.out.println(dashes);
    // }

    // private void makeNumberedMenuChoices(int amountOfMenuChoices){
    //     String menuChoice = "";
    //     for (int i = 0; i < amountOfMenuChoices; i++){
    //         int number = i + 1;
    //         menuChoice = number + ")" + " Menu choice " + number;
    //         System.out.println(menuChoice);
    //     }

    // }

}
