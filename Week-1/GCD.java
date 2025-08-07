import java.util.Scanner;

class GCD
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number :");
        int a= sc.nextInt();
        System.out.println("enter second number :");
        int b= sc.nextInt();

        GCD g = new GCD();
        System.out.println("GCD of "+a+" & "+b+" is " + g.getGCD(a,b));
    }

    //  int getGCD(int a , int b)
    // {
    //     int result=(a<b)?a:b;

    //     while(result>0)
    //     {
    //         if((a%result)==0 && (b%result)==0)
    //             break;
            
    //         result--;
    //     }

    //     return result;
    // }

    //  int getGCD(int a , int b)
    // {
    //     if(a==0)
    //         return b;

    //     if(b==0)
    //         return a;

    //     if(a==b)
    //         return a;

    //     if(a>b)
    //         return getGCD(a-b, b);
    //     else 
    //         return getGCD(a, b-a);
    // }

     int getGCD(int a , int b)
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