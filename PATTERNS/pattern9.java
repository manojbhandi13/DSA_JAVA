import java.util.Scanner;
public class pattern9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i = 0; i<n; i++){
           //space
           for(int j=0; j<n-i-1; j++){
            System.out.print(" ");
           }
           //star
           for(int j=0; j<(2*i)+1; j++){
               System.out.print('*');
           }
           //space
           for(int j=0; j<n-i-1; j++){
               System.out.print(" ");
           }
           System.out.println();
        }
        for(int i=0; i<n; i++){
            //space 
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<(n+(n-(2*i+1))); j++){
                System.out.print('*');
            }
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //Pattern7 and Pattern8 combined
    }
}