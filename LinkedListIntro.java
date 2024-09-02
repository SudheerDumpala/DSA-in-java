//Linkedlist in java
import java.util.Scanner;
class Node{
    int data;
    Node next;
}
class LinkedListImplement{
    Node head;
    public void insert(int data){
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
    // printing the values in the list
    public void show(){
        Node node = head;
        while(node!= null){
            System.out.println(node.data);
            node = node.next;
        }
    }
} 
    
public class LinkedListIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedListImplement list = new LinkedListImplement();
        System.out.println("Enter the elements into the list(enter -1 to end the Input): ");
        while(true){
            int value = input.nextInt();
            if(value!= -1){
                list.insert(value);
            }
            else{
                break;
            }
        }
        System.out.println("The elements in the linked list are: ");
        list.show();
    }
}
