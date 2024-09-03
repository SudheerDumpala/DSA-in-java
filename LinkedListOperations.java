// Insertion at start ,any position and from the end,
// delete elements in linked list
import java.util.Scanner;
class Node{
    int data;
    Node next;
}
class LinkedListImplementation{
    Node head = null;
    public void insertAtEnd(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    public void insertAt(int index,int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0){
            insertAtStart(data);
        }
        else{
            Node n = head;
            for(int i = 0;i<index-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            for(int i = 0;i<index-1;i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }
    public void show(){
        Node node = head;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
public class LinkedListOperations {
    public void instructions(){
        System.out.println("Index to do Operations");
        System.out.println("Enter 1 to insert at start");
        System.out.println("Enter 2 to insert at custom position");
        System.out.println("Enter 3 to insert at end");
        System.out.println("Enter 4 to delete data from custom position");
        System.out.println("Enter -1 to stop input");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedListImplementation list = new LinkedListImplementation();
        LinkedListOperations obj = new LinkedListOperations();
        obj.instructions();
        System.out.print("Enter your input here: ");
        int Input = input.nextInt();
        OUTER:
        while (true) {
            switch (Input) {
                case 1 -> {
                    System.out.println("Enter the data to add at start: ");
                    list.insertAtStart(input.nextInt());
                    System.out.println();
                    obj.instructions();
                    System.out.println();
                    System.out.print("Enter your input here: ");
                    Input = input.nextInt();
                }
                case 2 -> {
                    if(list.head == null){
                        System.out.println("The list is empty. Insertion at custom position is not possible.");
                        System.out.println("Enter the data to add at start: ");
                        list.insertAtStart(input.nextInt());
                    }
                    else{
                        System.out.println("Enter the data to add at the index: ");
                        System.out.println("Enter The position: ");
                        int position = input.nextInt();
                        System.out.println("Enter the data: ");
                        int data = input.nextInt();
                        list.insertAt(position, data);
                        System.out.println();
                        obj.instructions();
                        System.out.println();
                        System.out.print("Enter your input here: ");
                        Input = input.nextInt();
                    }
                }
                case 3 -> {
                    System.out.println("Enter the data from the end: ");
                    list.insertAtEnd(input.nextInt());
                    System.out.println();
                    obj.instructions();
                    System.out.println();
                    System.out.print("Enter your input here: ");
                    Input = input.nextInt();
                }
                case 4 -> {
                    if(list.head == null){
                        System.out.println("The list is empty. Deletion is not possible.");
                        System.out.println("do any other operation from instructions");
                        Input = input.nextInt();
                    }
                    else{
                        System.out.println("Enter the index of the value to delete: ");
                        list.deleteAt(input.nextInt());
                        System.out.println();
                        obj.instructions();
                        System.out.println();
                        System.out.print("Enter your input here: ");
                        Input = input.nextInt();
                    }
                }
                case -1 -> {
                    System.out.println();
                    System.out.println("The data in the linked list : ");
                    list.show();
                    break OUTER;
                }
                default -> {
                    System.out.println("Wrong Input ...!!\n Please enter input according to the instructions.");
                    System.out.print("Enter your input here: ");
                    Input = input.nextInt();
                }
            }
        }
        input.close();
    }
}
