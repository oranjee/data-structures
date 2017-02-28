package bstree;

public class Node {
    
    int data;
    Node leftChild;
    Node rightChild;
    
//    Pre conditions:
//              The node constructor does not accept any parameters.
    public Node(){
        data=0;
        leftChild=null;
        rightChild=null;
    }
//    Post conditions:
//              The constructor does not return any values, and sets the data 
//              variable to 0 and the left and right child nodes to null.
    
//    Pre conditions:
//              The node constructor accepts an integer value as a parameter.
    public Node(int value){
        data=value;
        leftChild=null;
        rightChild=null;
    }
//    Post conditions:
//              The constructor does not return any values, and sets the data
//              variable to the value and the left and right child nodes to null
    
//    Pre conditions:
//              The getData function does not accept any parameters.
    public int getData(){
        return data;
    }
//    Post conditions:
//              The function returns the data variable.
    
//    Pre conditions:
//              The setData function accepts an integer value as a parameter.
    public void setData(int value){
        data=value;
    }
//    Post conditions:
//              The function does not return anything but sets data to the 
//              passed value.
    
//    Pre conditions:
//              The functino does not accept any parameters.
    public Node getLeftChild(){
        return leftChild;
    }
//    Post conditions:
//              The function returns the node leftChild.
    
//    Pre conditions:
//              The function accepts a Node as a parameter.
    public void setLeftChild(Node left){
        leftChild=left;
    }
//    Post conditions:
//              The function does not return anything but sets leftChild to the
//              passed value.
    
//    Pre conditions:
//              The function does not accept any parameters.
    public Node getRightChild(){
        return rightChild;
    }
//    Post conditions:
//              The function returns the node rightChild.
    
//    Pre conditions:
//              The function accepts a Node as a parameter.
    public void setRightChild(Node right){
        rightChild=right;
    }
//    Post conditions:
//              The function does not return anything but sets rightChild to the
//              passed value.
}
