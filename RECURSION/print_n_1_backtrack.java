import java.util.Scanner;

public class print_n_1_backtrack {
    public static void recurse(int i, int n){
        if(i>n) return;
        recurse(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurse(1, n);
    }
}