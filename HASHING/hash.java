import java.util.Scanner;
public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        //pre-compute
        int[] hash=new int[13];
        for(int i=0; i<n; i++){
            hash[arr[i]]+=1;
        }
        System.out.println();

        int q=sc.nextInt();
        System.out.println();
        while(q>0){
            int number=sc.nextInt();
            
            //fetch
            if(number>=0 && number<hash.length){
            System.out.println(hash[number]);
            System.out.println();
            } else {
                System.out.println(0);
                System.out.println();
            }
            
            q--;
        }
    }
}