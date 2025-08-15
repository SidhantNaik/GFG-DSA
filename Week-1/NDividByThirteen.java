import java.util.Scanner;

public class NDividByThirteen {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        System.out.println(n + " divided by 13 = " + divThirteen(n));
    }

    static boolean divThirteen(String n) {

        if (n.length() <= 10) {
            if (Integer.parseInt(n) % 13 == 0)
                return true;
            return false;
        }
        else{

            int rem=0;
            for (char c : n.toCharArray()) {
                rem=(rem*10+(c-'0'))%13;
            }

           return rem==0;
        }
    }
}
