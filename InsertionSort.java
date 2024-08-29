//Insertion sort program in java
import java.util.Scanner;
class InsertionSortImplement{
    public int[] insertionsort(int[] array,int size){
        for(int i=1;i<size;i++){
            int j;
            int min =array[i];
            for(j=i-1;j>=0 && array[j]>min;j--){
                array[j+1]=array[j];
            }
            array[j+1] = min;
        }
        return array;
    }
}
class ArrayInput{
    Scanner input = new Scanner(System.in);
    public int[] arrayInput(int size){
        int[] array = new int[size];
        System.out.println("Enter the elements into the array: ");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        InsertionSortImplement isi = new InsertionSortImplement();
        isi.insertionsort(array,size);
        return array;
    }
}
public class InsertionSort{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        ArrayInput ai = new ArrayInput();
        int result[] = ai.arrayInput(size);
        System.out.println("Sorted array: ");
        for(int i: result){
            System.out.println(i+" ");
        }
        input.close();
    }   
}