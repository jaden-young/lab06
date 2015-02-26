package lab06;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jaden.young
 */
public class IsabelTechnique {
    
    static int sumValues(int[] A) {
        
         if(A.length == 1)
            return A[0];
         
        int B[] = new int[A.length / 2];
        
        for(int i = 0; i < B.length; i++)
            B[i] = A[2 * i] + A[2 * i + 1];

        return sumValues(B);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int A[] = new int[64];
        for(int i = 0; i < A.length; i++)
            A[i] = rand.nextInt(10) + 1;
        
        System.out.println("The sum of 64 randomly generated numbers between "
                + "1 and 10 is: " + sumValues(A));
    }
}
