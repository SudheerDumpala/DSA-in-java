// Linear Search Program in java 
import java.util.Scanner;
class LinearSearchOperation{
    public int LinearSearching(int[] Array,int target){
        for(int i=0;i<Array.length;i++){
            if(Array[i]==target){
                return i;
            }
        }
        return -1;
    }
}
class Intake{
    public /*int[]*/ int getArray(int size){
        /* If we return an array of elements, then we must declare the
        return type of the method with "int []" */
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the elements to the arary: ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        LinearSearchOperation obj1 = new LinearSearchOperation();
        int result = obj1.LinearSearching(arr,target);
        input.close();
        return result; 
        //return arr;
    }
}
public class LinearSearch{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int size = input.nextInt();
        Intake obj = new Intake();
         // If we want to print the array we given as Input
         /*
        int[] returnedArray = obj.getArray(size);
        // using for-loop
        System.out.print("The given array of elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(returnedArray[i]+" ");
        }
        // using for-each loop
        for(int i: returnedArray){
            System.out.print(i+" ");
        }
        */
        int result = obj.getArray(size);
        if(result != -1){
            System.out.println("The Element is found at Index "+result);
        }
        else{
            System.out.println("The required element is not found in the array ...!");
        }
        input.close();

    }
}