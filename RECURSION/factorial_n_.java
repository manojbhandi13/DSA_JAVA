import java.util.Scanner;

public class factorial_n_ {
    public static void factorial(int i, int fctrl){
        if(i==0){
            System.out.println(0);
            return;
        }
        if(i<2) {
            System.out.println(fctrl);
            return;
        }
        factorial(i-1, fctrl*i);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       factorial(n, 1);
    }
}