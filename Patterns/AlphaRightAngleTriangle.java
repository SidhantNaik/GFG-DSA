import java.util.Scanner;

public class AlphaRightAngleTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            char ch = 'A';
            for(int j=0;j<i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
