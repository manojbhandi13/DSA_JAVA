import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int iniSp=0;
        for(int i=0; i<n; i++){
            //stars
            for(int j=0; j<n-i; j++){
                System.out.print('*');
            }
            //spaces
            for(int j=0; j<iniSp; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<n-i; j++){
                System.out.print('*');
            }
            iniSp+=2;
            System.out.println();
        }
        iniSp=2*n-2;
        for(int i=0; i<n; i++){
            //stars
            for(int j=0; j<i+1; j++){
                System.out.print('*');
            }
            //spaces
            for(int j=0; j<iniSp; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<i+1; j++){
                System.out.print('*');
            }
            iniSp-=2;
            System.out.println();
        }   
    }
}