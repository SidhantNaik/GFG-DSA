import java.util.Scanner;
import java.lang.Math;

public class FindSqrtOfN {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        FindSqrtOfN f = new FindSqrtOfN();

        System.out.println("The square root of "+n+" is "+f.getSquareRoot(n));
    }

    double getSquareRoot(int n)
    {
        int sqrt=0;

        
        while (sqrt*sqrt<n) {
            sqrt++;
        }

        //return sqrt;

        return Math.sqrt(n);
    }
}
