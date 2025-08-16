public class ModularExponentiation {
    public static void main(String[] args) {
        
        System.out.println("The Mooduar Exponent is :"+getModExpo(2,6,10));
    }

    //Regular Method.
    static int getModExpo(int a,int b,int m)
    {
        int res=1;
        for(int i=1;i<=b;i++)
        {
            //res*=a;
            res=(res*a)%m;
        }

        //return (res%m);
        return res;
    }
}
