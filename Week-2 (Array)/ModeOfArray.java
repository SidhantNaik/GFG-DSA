public class ModeOfArray {
    public static void main(String[] args) {
        int[] arr ={1,2,6,2,8,2,1,1};

        System.out.println("The mode element in array is ="+getModeElement(arr));
    }


    //Effecient but not perfect
   /* static int getModeElement(int arr[])
    {
        int modeEle=0,count=0;

        for(int n:arr)
        {
            if(count==0) modeEle=n;

            count+=(n==modeEle)?1:-1;
        }
       
        return modeEle;
    } */

    static int getModeElement(int arr[])
    {
        int maxCount = 0;
        int modeElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                modeElement = arr[i];
            }
        }

        return modeElement;
    }
}
