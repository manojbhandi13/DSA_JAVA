import java.util.Scanner;
public class Armstrong_No {
    public static void checkArmstrong(int n){
        int N=n, N_1=N, count=0, numArmstrong=0;
        while(n>0){
            n/=10;
            count++;
        }
        //int count= String.valueOf(n).length(); // number of digits
        while(N>0){
            int last_digit=N%10;
            N/=10;
            numArmstrong+=(int)Math.pow(last_digit, count);
        }
        //System.out.println(numArmstrong);
        if(N_1==numArmstrong) System.out.println("Is Armstrong");
        else System.out.println("Not Armstrong");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkArmstrong(n);
    }
}