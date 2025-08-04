import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberUptoN {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PrimeNumberUptoN Pn = new PrimeNumberUptoN();

        System.out.println(Pn.PrimeNumbers(n));

    }

    ArrayList<Integer> PrimeNumbers(int n)
    {
        boolean[] primes= new boolean[n+1];

        for(int i=0;i<=n;i++)
            primes[i]=true;

        
        for(int i=2;i*i<=n;i++)
        {
            if(primes[i])
            {
                for(int j=i*i;j<=n;j+=i)
                    primes[j]=false;
            }
        }

        
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=2;i<=n;i++)
        {
            if(primes[i])
                arr.add(i);
        }

        return arr;
    }
}
