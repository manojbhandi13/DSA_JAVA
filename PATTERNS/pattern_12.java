import java.util.Scanner;
public class pattern_12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=2*(n-1);
        for(int i=0; i<n; i++){
            //numbers
            for(int j=0; j<i+1; j++){
                System.out.print(j+1);
            }
            //spaces
            for(int j=2*n-2*i-3; j>=0; j--){
                System.out.print(" ");
            }
            //numbers
            for(int j=i+1; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}