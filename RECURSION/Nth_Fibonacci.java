import java.util.Scanner;

public class Nth_Fibonacci {
    public static int fibonacci(int n){
        if(n<=1) return n;
        int last=fibonacci(n-1);
        int slast=fibonacci(n-2);
        return last + slast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}