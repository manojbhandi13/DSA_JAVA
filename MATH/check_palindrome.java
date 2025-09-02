import java.util.Scanner;
public class check_palindrome {
    public static void reverseNumber(int n) {
        int N=n;
        int revNum=0;
        while (n > 0) {
            int last_digit = n % 10;
            n /= 10;
            revNum=(revNum*10)+last_digit;
        }
        if(revNum==N){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //System.out.println(revNum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverseNumber(n);
    }
}