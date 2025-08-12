import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter the binary number:");

        Scanner sc = new Scanner(System.in);
        String bin= sc.nextLine();

        char[] binArray=bin.toCharArray();

        int res=0,posValue=1;


        for(int i=binArray.length-1;i>=0;i--)
        {
            if(binArray[i]=='1')
                res+= posValue;

                posValue*=2;
        }

        System.out.println("Decimal of "+bin+" is "+res);

    }
} 
