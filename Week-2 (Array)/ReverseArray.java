
public class ReverseArray {
    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6};

        System.out.print("Array Before Reverse: ");
        for (int i : arr) {
            System.out.print(i);
        }

        int left=0,right=arr.length-1;

        while (right>left) {
            
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;

            left++;
            right--;
        }

        System.out.print("\nArray after Reverse: ");
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
