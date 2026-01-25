import java.util.Scanner;

public class InsertionSort {
    
    public static  void sortTheArrayByInsertionSort(int arr[])
    {
        int n=arr.length;
        int j;

        for(int i=0;i<n;i++)
        {
            j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp =arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array...");
        int size=sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        sortTheArrayByInsertionSort(arr);
        for(int ele :arr)
        {
            System.out.print(ele+" ");
        }

    }
}
