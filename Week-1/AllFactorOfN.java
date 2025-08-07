import java.util.HashSet;
import java.util.Scanner;

public class AllFactorOfN {

    static HashSet<Integer> printDivisors(int n) {
        HashSet<Integer> divisors = new HashSet<>();
        
        // Note that this loop runs till square root
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                
                    divisors.add(i);
                    divisors.add(n / i);
                
            }
        }
        return divisors;
    }

    public static void main(String[] args) {

        System.out.println("enter the numbers :");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       System.out.println(printDivisors(a));
        
    }
}
