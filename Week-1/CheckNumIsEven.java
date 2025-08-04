import java.util.Scanner;

class CheckNumIsEven
{
    public static void main(String[] args) {

        System.out.println("Enter the number:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        CheckNumIsEven d = new CheckNumIsEven();

        System.out.println(d.isEven(n));

    }

    // boolean isEven(int n)
    // {
    //     if(n%2==0)
    //         return true;
    //     else
    //         return false;
    // }

    boolean isEven(int n)
    {
        if((n&1)==0)
            return true;
        else 
            return false;
    }

}