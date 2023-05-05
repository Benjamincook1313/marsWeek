import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();


    String name = null;
    int number = ran.nextInt(100);
    int guess = 0;

    System.out.println(ran + ", " +  number);
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("What is your name?");

    name = scan.nextLine();

    System.out.println("Hello " + name);
    System.out.println("Please Guess a number between 0 and 100");

    guess = scan.nextInt();

    while(guess != number){
      if(0 > guess || guess > 100) System.out.println("Invalid input try again.");

      boolean hire = guess < number? true: false;

      if(hire) System.out.println("to low guess again");
      else System.out.println("To high guess again");

      guess = scan.nextInt();
    }

    System.out.println("You got it!");
    scan.close();

  }

  public GuessingGame() {
  }
}
