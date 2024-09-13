// Trees in java
// Binary Search Tree
package com.binarysearchtrees;
import java.util.Scanner;
class Node{
    int data;
    Node rightNode, leftNode;

    public Node(int data){
        this.data = data;
    }
    @Override
    public String toString() {
        return String.valueOf(data);  // Return the value of the node
    }

}
class BinaryTreeImplement{
    Node root;
    public void insert(int data){
        root = insertRecursion(root, data);
    }
    public Node insertRecursion(Node node, int data){
        if(node == null){
            node = new Node(data);
        }
        else if(data < node.data){
            node.leftNode = insertRecursion(node.leftNode, data);    
        }
        else{
            node.rightNode = insertRecursion(node.rightNode, data);
        }
        return node;
    }
    /* In order to display the tree, we neeed no traverse through all nodes.
         * we have 3 Tree traversing theniques are available,
         * 1) In Order Traversal   : LEFT - ROOT - RIGHT
         * 2) Pre-order Traversal  : ROOT - LEFT - RIGHT
         * 3) Post-order Traversal : LEFT - RIGHT - ROOT
    */
    public void displayTree(){
        // in order traversal
        if(root == null){
            System.out.println("Tree is empty..!!");
        }
        else{
            inorderRecursion(root);
        }
    }
    public void inorderRecursion(Node root){
        if(root!= null){
            inorderRecursion(root.leftNode);
            System.out.println(root +" ");
            inorderRecursion(root.rightNode);
        }
    }
}
public class BinaryTrees {
    public static void main(String[] args) {
        BinaryTreeImplement bti = new BinaryTreeImplement();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter data into the tree(-1 to STOP): ");
        while(true){
            int data = input.nextInt();
            if(data == -1){
                bti.displayTree();
                input.close();
                break;
            }
            else{
                bti.insert(data);
            }
        }
    }
}
