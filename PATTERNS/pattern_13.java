import java.util.Scanner;

public class pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){ //Inner loop runs no. of row times
            System.out.print(num+" ");
            num++; // num gets incremented after every print to maintain continuity
            }
            System.out.println();
        }
    }
}