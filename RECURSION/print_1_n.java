import java.util.Scanner;

public class print_1_n {
    public static void recurse(int i, int n){
        if(i>n) return;
        System.out.println(i);
        recurse(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurse(1, n);
    }
}