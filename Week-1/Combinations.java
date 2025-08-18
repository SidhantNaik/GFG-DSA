import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Enter r:");
        int r = sc.nextInt();

        System.out.println("Combinations =" + nCr(n, r));
    }
    
    //Native approch.
    /*static int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }
        if (r == 0 || r == n) {
            return 1;
        }
        return fact(n) / (fact(r) * fact(n - r));
    }
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }*/
    

    //Better approach
    static int nCr(int n,int r)
    {
         double sum = 1;

        // Calculate the value of n choose r using the
        // binomial coefficient formula
        for (int i = 1; i <= r; i++) {
            sum = sum * (n - r + i) / i;
        }

        return (int)sum;
    }

}