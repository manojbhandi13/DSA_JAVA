import java.util.Scanner;

public class pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*for(int i=1; i<=n; i++){
            System.out.print('*');
        }
        System.out.println();
        for(int i=1; i<=n-2; i++){
            System.out.print('*');
            for(int j=1; j<=n-2; j++){
                System.out.print(" ");
            }
            System.out.print('*');
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            System.out.print('*');
        }*/
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i==1 || i==n || j==1 || j==n) System.out.print('*');
            else System.out.print(" ");
        }
        System.out.println();
       }
    }
}