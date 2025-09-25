/*The program is for lowercase alphabet letters. Replace the values as 
shown in below comments (for respective lines) for the program of all 
the 256 characters.*/
import java.util.Scanner;

public class CharHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println();
        int[] hash=new int[26]; // 26 -> 256
        //pre-compute
        for(int i=0; i<s.length(); i++){    
            hash[s.charAt(i)-'a']+=1; // s.charAt(i)-'a'  ->  s.charAt(i)
        }
        //fetch
        int q=sc.nextInt();
        System.out.println();
        while(q>0){
            char ch=sc.next().charAt(0);
        System.out.println(hash[ch-'a']); //ch-'a'  ->  ch 
            System.out.println();
            q--;
        }
    }
}