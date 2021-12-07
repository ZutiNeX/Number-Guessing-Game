//Note:
//This is my first project i made after learning java langauge

import java.util.Scanner;

class guesserz{
    public static void
    guessingNumberGame(){
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100
                * Math.random());

        int K = 5;
        int i, guess;

        System.out.println("A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number"
                        + " within 5 trials.");
        for (i = 0; i < K; i++){
            System.out.println(
                    "Guess The Number: ");

        guess = sc.nextInt();

        if (number==guess) {
            System.out.println("Congragulations" +
                    "You guessed the number");
            break;
        }

        else if (number > guess
        && i != K-1) {
            System.out.println("The number is"
                    + " greater than " + guess);
        }
        }

        if (i==K) {
            System.out.println("You have exhausted"
            + " 5 trials ");
        }

        System.out.println("The Number Was " + number);

    }

}

public class Projjj {
    public static void main(String[] args) {
       guesserz gz = new guesserz();
       gz.guessingNumberGame();
    }
}

//End of the game thank you guys this is the end of the code
