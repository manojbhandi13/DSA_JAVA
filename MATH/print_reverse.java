import java.util.Scanner;
public class print_reverse {
        public static void reverseNumber(int n) {
            int revNum=0;
            while (n > 0) {
                int last_digit = n % 10;
                n /= 10;
                revNum=(revNum*10)+last_digit;
            }
            System.out.println(revNum);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            reverseNumber(n);
        }
}