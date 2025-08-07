import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("enter the two numbers :");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int g=Math.max(a, b);
        int s = Math.min(a, b);

        // int lcm=0;
        // for(int i=g;i<a*b;i+=g)
        // {
        //     if(i%s==0)
        //     {
        //         lcm=i;
        //         break;
        //     }
        //     else
        //     {
        //         lcm=a*b;
        //     }
        // }
        

        GCD g = new GCD();
        int lcm = (a * b) /g.getGCD(a, b);

        System.out.println("GCD of " + a + " & " + b + " is " + lcm);

    }
}
