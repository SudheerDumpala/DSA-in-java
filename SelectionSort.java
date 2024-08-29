// Selection Sort program in java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class SelectionSortImplement{
    public ArrayList<Integer> selectionsort(ArrayList<Integer>arrayList,int size){
        for(int j=0;j<size-1;j++){
            int min = j;
            for(int i=j+1;i<size;i++){
                if(arrayList.get(i)<arrayList.get(min)){
                    min = i;
                }
            }
            int temp = arrayList.get(j);
            arrayList.set(j, arrayList.get(min));
            arrayList.set(min, temp);
        }
        return arrayList;
    }
}
class ArrayInput{
    public ArrayList<Integer> arrayinput(int size) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        System.out.println("Enter the elements into the array: ");
        for(int i=0;i<size;i++){
            arrayList.add(Integer.valueOf(bf.readLine()));
        }
        SelectionSortImplement ssi= new SelectionSortImplement();
        ssi.selectionsort(arrayList,size);
        bf.close();
        return arrayList;
    }
}
public class SelectionSort{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no. of elements: ");
        int size = Integer.parseInt(bf.readLine());
        ArrayInput ai = new ArrayInput();
        ArrayList<Integer> arrayList = ai.arrayinput(size);
        System.out.println("The Sorted array of elements are: ");
        for(int i: arrayList){
            System.out.print(i+" ");
        }
        bf.close();
    }
}