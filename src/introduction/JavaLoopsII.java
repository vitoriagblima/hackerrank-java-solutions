package introduction;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int atual = a;
            
            for(int j = 0; j < n; j++) {
                atual += (1 << j) * b;
                System.out.print(atual + " ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
