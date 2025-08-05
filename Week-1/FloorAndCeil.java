public class FloorAndCeil {

    public static void main(String[] args) {
        int a = 7, b = -2;

        System.out.println("This is Floor =" + getFloor(a, b));

        System.out.println("This is Ceil =" + getCeil(a, b));

    }

    static int getFloor(int a, int b) {
        int q = a / b;

        if ((a ^ b) < 0 && a % b != 0)
            q--;

        return q;
    }

   static int getCeil(int a, int b) {
        int q = a / b;

        if ((a ^ b) > 0 && a % b != 0)
            q++;

        return q;
    }
}