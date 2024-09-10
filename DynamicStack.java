// Dynamic Implementation of stack
// Expanding and shrinking the size of the stack dynamically
import java.util.Scanner;
class DynamicStackImplement{
    private int top;
    private int[] stack;
    private int size;
    public DynamicStackImplement(int length){
        size = length;
        stack = new int[size];
        top = -1;
    }
    // Expanding the stack size if it is full
    public void expand(){
        int currentsize = size();
        int[] expandStack = new int[size*2];
        System.arraycopy(stack, 0, expandStack, 0, currentsize);
        stack = expandStack;
        size = size*2;
    }
    // shrinking the size of the stack if the data is lesser than the size
    public void shrink(){
        int length = size();
        if(length <= (size/2)/2) {
            size = size/2; 
            int[] shrinkStack = new int[size];
            System.arraycopy(stack, 0, shrinkStack, 0, length);
            stack = shrinkStack;
        }
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        return top < 0; 
    }
    public void push(int data){
        if(size() == size){
            expand();
        }
        top++;
        stack[top] = data;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("unable to do pop operation, stack is empty!");
        }
        else{
            int poppedElement = stack[top];
            stack[top] = 0;
            System.out.println("The popped Element is :"+poppedElement);
            top--;
            shrink();
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("unable to retrive data! stack is empty");
        }
        else{
            System.out.println("The first element of the stack is: "+stack[top]);
        }
    }
    public void showStack(){
        if(isEmpty()){
            System.out.println("The stack is empty...!");
        }else{
            System.out.println("data in the stack: ");
            for(int i=0;i<size;i++){
                if(i<=top){
                System.out.println(stack[i]);
                }
                else{
                System.out.println(0);
                }
            }
        }
    }
}
public class DynamicStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial size of the stack: ");
        int size = input.nextInt();
        DynamicStackImplement dsi = new DynamicStackImplement(size);
        System.out.println("Index to do Operations");
        System.out.println("Enter -1 to print elements of stack and stop");
        System.out.println("Enter 1 to push element into stack");
        System.out.println("Enter 2 to pop element from stack");
        System.out.println("Enter 3 retrive element from top");
        while(true){
            System.out.println("Enter the choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter data to push into stack: ");
                    dsi.push(input.nextInt());
                }
                case 2 -> dsi.pop();
                case 3 -> dsi.peek();
                case -1 -> {
                    dsi.showStack();
                    input.close();
                    return;
                }
                default -> System.out.println("Oops! you have entered the wrong input");    
            }
        }
    }
}
