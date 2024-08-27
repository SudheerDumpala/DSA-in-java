// Bubble Sort program in java
import java.util.Scanner;
class BubbleSortImplement{
    public int[] bubblesort(int[] arr){
        int size = arr.length;
        for(int j=0;j<size-1;j++){
            for(int i=0;i<(size-1-j);i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
class ArrayIntake{
    public int[] arrayintake(int size){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the elements into the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        BubbleSortImplement bsi = new BubbleSortImplement();
        return bsi.bubblesort(arr);
    }
}
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        ArrayIntake obj = new ArrayIntake();
        int[] result = obj.arrayintake(size);
        System.out.println("The sorted array of elements are: ");
        for(int i: result){
            System.out.print(i+" ");
        }
        
    }
}
