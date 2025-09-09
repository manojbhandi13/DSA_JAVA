import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            /*char ch='E'; 
            ch-=i;
            for(int j=0; j<i+1; j++){
                System.out.print(ch);
                ch++;
            }*/
           for(char ch = (char)('E' - i); ch<='E'; ch++){
            System.out.print(ch);
           }
            System.out.println();
        }
    }
}