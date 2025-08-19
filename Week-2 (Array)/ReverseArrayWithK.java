
public class ReverseArrayWithK {
    public static void main(String[] args) {
         int[] arr= {1,2,3,4,5,6};
         int k=2;

        System.out.print("Array Before Reverse: ");
        for (int i : arr) {
            System.out.print(i);
        }

        System.out.print("\nArray after Reverse: ");
        
        for (int i : getReverseArray(arr,k)) {
            System.out.print(i);
        }
        
    }

    static int[] getReverseArray(int[] arr,int k)
    {
        int n=arr.length;
        k=k%n;

        //Reversing n-k elements
        for(int i=0,j=n-k-1;i<j;i++,j--)
        {
             int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        //Reversing k elements
        for(int i=n-k,j=n-1;i<j;i++,j--)
        {
             int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        //Reversing whole arr 
        for(int i=0,j=n-1;i<j;i++,j--)
        {
             int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        return arr;
    }
}
