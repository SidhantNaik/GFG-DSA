import java.util.Scanner;

class GCD
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number :");
        int a= sc.nextInt();
        System.out.println("enter second number :");
        int b= sc.nextInt();

        System.out.println("GCD of "+a+" & "+b+" is " + getGCD(a,b));
    }

    static int getGCD(int a , int b)
    {
        int result=(a<b)?a:b;

        while(result>0)
        {
            if((a%result)==0 && (b%result)==0)
                break;
            
            result--;
        }

        return result;
    }
}