import java.lang.Math;
import java.util.Scanner;
public class number_guess {
    public static void main(String[] args){
        int rdm=(int)(Math.random()*100), guess;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("Guess the number (Between 1 to 100 only): ");
            guess = sc.nextInt();
            if (guess >= 1 && guess <= 100) {
                if (guess == rdm) {
                    System.out.print("You are right. The number is ");
                    System.out.println(rdm);
                    break;
                } else if (guess > rdm) {
                    System.out.println("Your prediction is large!");
                } else {
                    System.out.println("Your prediction is small!");
                }
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}