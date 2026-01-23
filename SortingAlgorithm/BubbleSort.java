public class BubbleSort {
    
    static void BubbleSort(int arr[])
    {
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,25,15,35};
        BubbleSort(arr);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }

    }
}
