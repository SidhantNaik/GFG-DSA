import java.util.Scanner;

class CheckPrime{
    public static void main(String[] args)
    {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        CheckPrime cp = new CheckPrime();

        System.out.println(cp.isPrime(n));

    }


    boolean isPrime(int n)
    {
        if(n==2||n==3)
            return true;

        if(n<=1||n%2==0||n%3==0)
            return false;

        for(int i=5;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;

        return true;
    }

}