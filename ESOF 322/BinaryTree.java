/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Greg
 */
public class BinaryTree
{
    private static Node root;

    //Nested class for Node
    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node (int data) {
            this.data = data;
            right = null;
            left = null;
        }

        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        public Node getLeft() {
            return left;
        }
        public void setLeft(Node left) {
            this.left = left;
        } 
        public Node getRight() {
            return right;
        }
        public void setRight(Node right ) {
            this.right = right;
        }   
    }
    
    //BinaryTree constructor, takes initial data and makes a root node
    public BinaryTree(int data)
    {
        root = new Node(data);
    }

    //method for adding a new node, checks to see if the left node of the parent
    //is full and if so adds to the right instead
    public void add(Node parent, Node child)
    {
        if (parent.getLeft() == null)
        {
           parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }
    
    //Method for deleting node from tree. Just checks to see if there are no 
    //children and then deletes the node assuming it is not the root.
    public void delete(Node node){
        if(node.getLeft() == null && node.getRight() == null){
            if(!(node.equals(root))){
                node = null;
            }
        }
        else if(node.getLeft() != null || node.getRight() == null){
            node.setLeft(null);
            node.setRight(null);
        }
        else{
            System.out.println("Something else happened");
        }
    }
}


