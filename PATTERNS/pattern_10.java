import java.util.Scanner;
public class pattern10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=n-1; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print('*');
            }
            System.out.println();
        }*/
       for(int i=1; i<=2*n-1; i++){
        int stars=i;
        if(i>n) stars=2*n-i;
        for(int j=0; j<stars; j++){
            System.out.print('*');
        }
        System.out.println();
       }
    }
}