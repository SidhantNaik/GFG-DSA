import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

       System.out.println( "factorial: " + factorial(number));
    }

    static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n * factorial(n-1);
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static int countVowels(String str) {
        int count = 0;
        
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
        
    }

    //remove blank spaces from the string
    static String removeBlankSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    //replace all uppercase letters with lowercase without using inbuilt funtions
    static String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c - 'A' + 'a'));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    /*checking if all charaters of string a is present in string b in any sequence by using sort and lenth of both stirng must be same
    static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        return Arrays.equals(aArray, bArray);
    } */
   

}
