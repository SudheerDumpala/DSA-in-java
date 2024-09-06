// stack implementation in java - (LIFO rule)
/*generally we use three main functions in stack, they are
1) push - used to insert the element into the stack from one end
2) pop - used to remove the element from the stack from one end
3) peek - used to retrive the top element from stack without removing it
*/
import java.util.Scanner;
class StackImplementation{
    private int[] stack;
    private int top;
    public StackImplementation(int size){
        stack = new int[size];
        top = -1;
    }
    public void push(int data){
        if(top == stack.length-1){
            System.out.println("stack overflowed! unable to push the data into the stack");
        }
        else{
            top++;
            stack[top] = data;
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("unable to do pop operation, stack is empty!");
        }
        else{
            int poppedElement = stack[top];
            System.out.println("The popped Element is :"+poppedElement);
            top--;
        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("unable to retrive data! stack is empty");
        }
        else{
            System.out.println("The first element of the stack is: "+stack[top]);
        }
    }
    public void showStack(){
        System.out.println("The data in the stack: ");
        for(int i:stack){
            System.out.println(i);
        }
    }
}
public class Stack {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        StackImplementation si = new StackImplementation(size);
        System.out.println("Index to do Operations");
        System.out.println("Enter -1 to print elements of stack and stop");
        System.out.println("Enter 1 to push element into stack");
        System.out.println("Enter 2 to pop element from stack");
        System.out.println("Enter 3 retrive element from top");
        OUTER:
        while (true) { 
            System.out.print("Enter your choice :");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter data to push into stack: ");
                    si.push(input.nextInt());
                }
                case 2 -> si.pop();
                case 3 -> si.peek();
                case -1 -> {
                    si.showStack();
                    break OUTER;
                }
                default -> System.out.println("Oops! you have entered the wrong input");    
            }
        }
        input.close();
    }
}
