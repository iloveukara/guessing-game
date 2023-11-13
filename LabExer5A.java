import java.util.*;
public class LabExer5A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int randomNum = random.nextInt(50)+1; 
        // creating a random number from 1 to 50
		int tries = 0;
        // keeps score of the tries
        int guess = 0;
        // guess starts from 0 
        boolean hula = false;
        // this will help to keep track of the loop, of when to stop the loop 
		
		System.out.println("Guess a number from 1 to 50!");

        while (!hula) {
            try {
                guess = input.nextInt();

                if (guess > randomNum) {
                    System.out.println("Too high. Try again.");
                    tries++;
                    // will print if the guess is greater than the random number
                }
                else if (guess < randomNum) {
                    System.out.println("Too low. Try again.");
                    tries++;
                    // will print if the guess is less than the random number
                }
                else if (guess == randomNum) {
                    tries++;
                    System.out.println("You got it in " + tries + " attempts!" );
                    hula = true;
                }

                if(guess < 1 || guess > 50) {
                    throw new IllegalArgumentException("only between 1 and 50 ! ");
                    // custom exception of when the guess is out of range
                }
            }
            catch (InputMismatchException exx) {
                System.out.println("Invalid input");
                input.nextLine();
                // catches the invalid input by the user
            }
            catch (IllegalArgumentException ex) {
                System.out.println("Out of range.");
                input.nextLine();
                // catches the invalid input by the user
            }
        }
    }
}
 