import java.util.Scanner;

public class sum_1st_n {
    public static void sumUp(int i, int sum){
        if(i<1){
        System.out.println(sum);
        return;
        }
        sumUp(i-1, sum+i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumUp(n, 0);
    }
}