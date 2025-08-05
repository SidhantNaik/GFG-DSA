import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        System.out.println("Enter the number:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        DecimalToBinary db = new DecimalToBinary();

        StringBuilder bin = new StringBuilder(db.usingMod(n));
        
        System.out.println("Binary of "+n+" is "+bin.reverse().toString());
        
    }

    String usingMod(int n)
    {
        String result="";
        while(n>0)
        {
            int rem = n%2;
            result+=rem;
            n/=2;
        }

        return result;
    }
}
