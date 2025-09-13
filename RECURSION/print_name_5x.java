import java.util.Scanner;
public class print_name_5x {
    static int count=0; // global variable
    public static void recurse(int n){
        if(count==n) return;
        System.out.println("Manoj");
        count++;
        recurse(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        recurse(n);
        
    }
}