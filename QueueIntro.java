// Queue in java (FIFO rule) First In First Out rule
/* Queues are basically consists of two main methods
 * 1) enqueue - it is used to insert the data into queue
 * 2) dequeue - it is used to delete data in the queue
 */
import java.util.Scanner;
class QueueImplement{
    private int front,rear,length;
    private int[] queue;
    public QueueImplement(int size){
        length = size;
        queue = new int[size];
    }
    public void enqueue(int data){
        if(rear >= length-1){
            expand();
        }
        queue[rear] = data;
        rear++;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("The Queue is Empty, nothing to delete!");
        }
        else{
            int data = queue[front];
            System.out.println("Deleted data: "+data);
            front++;
            shrink();
        }
    }
    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty! nothing to display");
        }
        else{
            System.out.println("Data in queue: ");
            for(int i=front;i<rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
    public boolean isEmpty(){
        return rear == 0;
    }
    public void expand(){
        int extendQueue[] = new int[length*2];
        System.arraycopy(queue, 0, extendQueue, 0, rear);
        queue = extendQueue;
        length *= 2;
    }
    public void shrink(){
        int capacity = length;
        if(rear <= (capacity/2)/2){
            length = length/2;
            int shrinkQueue[] = new int[length];
            System.arraycopy(queue, 0, shrinkQueue, 0, rear);
            queue = shrinkQueue;
        }
    }
}
public class QueueIntro {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the initial size of queue: ");
        int size = input.nextInt();
        QueueImplement qi = new QueueImplement(size);
        System.out.println("Index to do Operations");
        System.out.println("Enter -1 to stop");
        System.out.println("Enter 1 to enter data into Queue(from rear end)");
        System.out.println("Enter 2 to delete data from Queue(from front end)");
        System.out.println("Enter 3 print data in the queue");
        while(true){
            System.out.println("Enter the choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case -1 -> {
                    input.close();
                    return;
                }
                case 1-> {
                    System.out.print("Enter data into Queue: ");
                    qi.enqueue(input.nextInt());
                }
                case 2-> qi.dequeue();
                case 3-> qi.displayQueue();
                default -> System.out.println("Wrong choice..!\n please enter inout from the instructions above");
            }
        }
    }
}
