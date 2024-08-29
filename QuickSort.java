//Insertion Sort Program in java
import java.util.Scanner;
class QuickSortImplement{
    public int[] quicksort(int[] array,int left,int right){
        if(left<right){
            int partitionPosition = partition(array,left,right);
            quicksort(array, left, partitionPosition-1);
            quicksort(array,partitionPosition+1,right);
        }
        return array;
    }
    public int partition(int[] array,int left,int right){
        int i = left-1,pivot = array[right];
        for(int j=left;j<right;j++){
            if(array[j]<=pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
            int temp = array[i+1];
            array[i+1] = array[right];
            array[right] = temp;
            return i+1;
        }
}
class IntakeArray{
    Scanner input = new Scanner(System.in);
    public int[] intakeArray(int size){
        int[] array = new int[size];
        System.out.println("Enter ekements into the array: ");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        QuickSortImplement qsi = new QuickSortImplement();
        int left = 0,right = size-1;
        qsi.quicksort(array,left,right);
        input.close();
        return array;
    }
}
public class QuickSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        IntakeArray ia = new IntakeArray();
        int[] result = ia.intakeArray(size);
        input.close();
        System.out.println("Sorted array: ");
        for(int n: result){
            System.out.print(n+" ");
        }
    }
}
