import java.util.Scanner;
public class print_all_divisors {
    public static void printDivisor(int n){
        for(int i=1;i<=n; i++)
            if(n%i==0) System.out.println(i);
        //Can be optimised considering sqrt of n
        //Use list to store factors
        //And then sort the lis to obtain factors in sorted form

        /*
        "Create a list"
        for(int i=1; i*i<=n; i++){
        if(n%i==0) "Add i to list"
        if(n/i!=i) "Add i to list"
        }
        "Sort the list"
        */

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDivisor(n);
    }
}