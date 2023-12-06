import java.util.Random;
import java.util.Scanner;
class NumGuess{
    public static void main(String[] args){
        Random rand= new Random();
        int randnum = rand.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int count =0;
        int limit =5;
        while(true) {
            System.out.println("Enter your guess(1-100):");
            int userguess=sc.nextInt();
            count++;
            if (randnum == userguess) {
                System.out.println("Correct !You win");
                System.out.println("You guessed in " + count + " attempts");
                break;
            }
            else if(randnum>userguess) {
                System.out.println("The number is higher.Guess again");
            }
            else{
                System.out.println("The number is lower.Guess again");


            }
        }
        sc.close();

    }
}