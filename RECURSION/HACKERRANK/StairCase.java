/*The code works fine logically. But, exceeds the time limit of execution in HackerRank
for Java, which is 4 seconds. This is because the only-recursive approach is exponential,
and take more time for larger inputs.
The code can be optimized using DP, Memoization.*/

import java.util.Scanner;
public class StairCase{
    public static int stepPerms(int n){
        if(n<=2) return n;
        if(n==3) return 4;
        return stepPerms(n-1) + stepPerms(n-2) + stepPerms(n-3);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0; i<s; i++){
            int n=sc.nextInt();
            System.out.println(stepPerms(n));
        }
    }
}
