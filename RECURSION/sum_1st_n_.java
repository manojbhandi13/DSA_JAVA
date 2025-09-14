import java.util.Scanner;

public class sum_1st_n_ {
    public static int sumUp(int n){
        if(n==0) return 0;
        return n + sumUp(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumUp(n));
    }
}