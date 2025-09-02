import java.util.Scanner;
public class digit_extraction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            int last_digit=n%10;
            System.out.println(last_digit);
            n=n/10;
        }
    }
}
