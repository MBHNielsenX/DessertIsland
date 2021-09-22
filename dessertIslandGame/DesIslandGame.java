import java.util.Locale;
import java.util.Scanner;

public class DesIslandGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameStartValidation = false;

        String[] options = {"A knife", "A fishing net", "A box of matches", "A hammock", "A can of bug spray",
                "A bottle of sunblock", "An inflatable raft with rows", "A flashlight", "A spear", "A satellite phone"};

        int[] optionNumbers = new int[10];

        System.out.println("///////////////////////////////////");
        System.out.println(" Welcome to the desert island game");
        System.out.println("///////////////////////////////////");
        System.out.println("\n" + "Press enter to start the game: ");

        String startGame = scanner.nextLine();

        do {

            if (startGame == "") {
                System.out.println("What things would you want to bring with you to a desert island?: ");
                System.out.println("You will need to pick 3 things");
                gameStartValidation = true;

            } else {
                System.out.println("\n" + "Press enter to start the game: ");
                startGame = scanner.nextLine();

            }
        } while (!gameStartValidation);

        for (int i = 0; i < options.length; i++) {
            System.out.println(i + 1 + ". " + options[i]);

        }
        System.out.println();
        System.out.println("Please enter your choices: ");
        for (int i = 0; i < 3; i++) {

            int choiceInput = scanner.nextInt();

            for (int j = choiceInput - 1; j < choiceInput; j++) {

                optionNumbers[j] += 1;
                System.out.println("Your " + (i + 1) + " choice is " + options[choiceInput - 1].toLowerCase());

            }
        }
        
        
        for (int i = 0; i < optionNumbers.length; i++) {
                System.out.println(optionNumbers[i]);

        }
        System.out.println("The most popular choice is: " + mostPopularChoice(options,optionNumbers).toLowerCase());






    }
    public static String mostPopularChoice (String[] options,int[] optionsNumber) {
        int max = optionsNumber[0];
        int maxIndex = 0;
        for (int i = 1; i < optionsNumber.length ; i++) {
            if (optionsNumber[i] > max){
                maxIndex = i;
                max = optionsNumber[i];
            }
        }
       String popularChoice = options[maxIndex];


        return popularChoice;
    }

}
