import java.util.*;

public class perfect_Square {
    public static boolean perfect(int n)
    {
        int i  = (int)Math.sqrt(n);
        if(i*i == n) return true;
        return false;
    }
    public static int perfect_Squ(int n) {
        // Step1)  if the perfect square of n
        if (perfect(n)) return 1;


        // step3)  if  it is acc to the legrende 3 square sum formula according
        int temp = n;
        while (temp % 4 == 0) temp /= 4;
        if (temp % 8 == 7) return 4;

        // Step1)  if number is the sum of 2- perfect square.
        for (int i = 1; i * i <= n; i++) {
            int rem = n - i * i;
            if (perfect(rem)) return 2;
        }

        // Ste4)  other wise 3
        return 3;
    }

    public static void main(String[] args) {
        int ans = perfect_Squ(48);
        System.out.println(ans);
    }
}
 // lengredze theorem 
