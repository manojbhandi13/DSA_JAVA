import java.util.Scanner;

public class print_name_5x_ {
    public static void recurse(int i, int n){ // No global varibale used
        if(i>n) return;
        System.out.println("Manoj");
        recurse(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurse(1, n);
    }
}