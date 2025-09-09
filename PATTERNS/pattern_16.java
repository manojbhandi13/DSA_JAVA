import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        char ch='A';
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}