import java.util.Scanner;

public class factorial_n {
    public static int factorial(int n){
        if(n>0){
        if(n==1) return 1;
        return n * factorial(n-1);
        } else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}