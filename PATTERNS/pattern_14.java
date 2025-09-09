import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(char j='A'; j<='A'+i; j++){ //Looping is done on the character
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// Used the below logic before having the idea about ASCII
/*char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
for(int i=0; i<n; i++){
            for(char j=0; j<=i; j++){
                System.out.print(letters[j]);
            }
            System.out.println();
        }*/