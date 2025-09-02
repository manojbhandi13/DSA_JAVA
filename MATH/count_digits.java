import java.util.Scanner;

public class count_digits {
    public static int countDigit(int n) {
        int digit=0;
        while(n>0){
            digit++;
            n=n/10;
        }
        return digit;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(countDigit(n));
    }
}