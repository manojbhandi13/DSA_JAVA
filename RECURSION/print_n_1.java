import java.util.Scanner;

public class print_n_1 {
    public static void recurse(int i, int n){
        if(i<1) return;
        System.out.println(i);
        recurse(i-1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurse(n, n);
    }
}

/*import java.util.Scanner;

public class print_n_1 {
    public static void recurse(int n){
        if(n==0) return;
        System.out.println(n);
        recurse(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurse(n);
    }
}*/