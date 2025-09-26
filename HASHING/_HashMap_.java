import java.util.Scanner;
import java.util.HashMap;
public class _HashMap_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int[] arr=new int[n];
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println();
        int q=sc.nextInt();
        System.out.println();
        while(q>0){
            int number=sc.nextInt();
            System.out.println(map.getOrDefault(number, 0));
            System.out.println();
            q--;
        }
        map.clear();
    }
}