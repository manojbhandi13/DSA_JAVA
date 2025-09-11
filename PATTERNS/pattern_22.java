// n - Matrix = newMatrix
// n - newmatrix = Matrix

import java.util.Scanner;
import java.lang.Math;

public class pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n;
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                int minVert=Math.min(top, bottom);
                int minHor=Math.min(left, right);
                int minValue=Math.min(minVert, minHor);
                System.out.print(n-minValue);
            }
            System.out.println();
        }
    }
}