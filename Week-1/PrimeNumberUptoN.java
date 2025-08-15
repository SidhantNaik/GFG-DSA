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


    // convert this program to c#
    /*
    using System;
    using System.Collections.Generic;

    class PrimeNumberUptoN
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the number:");
            int n = Convert.ToInt32(Console.ReadLine());

            List<int> primes = PrimeNumbers(n);
            Console.WriteLine(string.Join(", ", primes));
        }

        static List<int> PrimeNumbers(int n)
        {
            bool[] primes = new bool[n + 1];
            for (int i = 0; i <= n; i++)
                primes[i] = true;

            for (int i = 2; i * i <= n; i++)
            {
                if (primes[i])
                {
                    for (int j = i * i; j <= n; j += i)
                        primes[j] = false;
                }
            }

            List<int> arr = new List<int>();
            for (int i = 2; i <= n; i++)
            {
                if (primes[i])
                    arr.Add(i);
            }

            return arr;
        }
    }
    */
   

}
