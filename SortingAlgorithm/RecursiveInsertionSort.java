import java.util.Scanner;

public class RecursiveInsertionSort {
    static public void InsertionSort(int arr[])
    {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element");
        int n = sc.nextInt();
        System.out.println("Enter the element of Array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        InsertionSort(arr);
    }
}
