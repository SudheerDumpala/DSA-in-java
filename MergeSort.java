// merge sort program in java
import java.util.Scanner;
public class MergeSort {
    public static void mergesort(int arr[],int left,int right){
        if(left<right){
            int mid = (left+right)/2;
            //recursively sort the left and the right arrays
            mergesort(arr,left,mid);
            mergesort(arr, mid+1, right);
            // merge function to merge the sorted halves
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int arr[],int left,int mid,int right){
        // sizes for the temporary arrays
        int s1 = mid-left+1;
        int s2 = right-mid;
        // creating the temporary arrays
        int[] leftArray = new int[s1];
        int[] rightArray = new int[s2];
        // copy the data to the temporary arrays
        for(int x = 0;x<s1;x++){
            leftArray[x] = arr[left+x];
        }
        for(int x = 0;x<s2;x++){
            rightArray[x] = arr[mid+1+x];
        }
        int i=0,j=0,k = left;
        while(i<s1 && j<s2){
            if(leftArray[i]<=rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // copy the remaining elements in the arrays(if any)
        while(i<s1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<s2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements into array: ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        // as we declared the method as static we can directly access using class
        MergeSort.mergesort(arr,0,size-1);
        System.out.println("Sorted array: ");
        for(int i: arr){
            System.out.println(i+" ");
        }
        input.close();
    }
}
