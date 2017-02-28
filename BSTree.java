/*Purpose:
*           The purpose is to become more familiar with how binary search trees
*           are built and to build a LinkedList for the binary search tree.
*Solution:
*           The problem of creating a binary search tree that will correctly 
*           sort randomly generate numbers can be solved by considering the 
*           structure of a binary search tree. To add a value to the tree, if 
*           the value is less than the value already in the tree, then that 
*           value is added to the left. If it is greater than, then the value is
*           added to the right. If there is already a right or left node, then 
*           the value is compared again until the right or left node is null, so
*           that the value can be added to the binary search tree in the correct
*           location. To display the values in the binary search tree in
*           ascending order, it's nessesary to first find the bottom left most 
*           leaf node. The nodes are then displayed one by in infix notation, 
*           left node, parent node, then right node, since the left node is 
*           always less than the parent node and the right node is always 
*           greater than the parent node.
*Data Structures:
*           The data structures used in this program are binary search trees and
*           LinkedLists.
*Description and Expected Input/Output:
*           The program can be used to generate 100 random numbers from 1-99 and
*           add them into a binary search tree, then display the numbers from
*           the binary search tree in ascending order. For the main method, 
*           there is no expected input from the user. The program generates 100
*           random integers from 1-99. The expected output for the main method
*           is the generated numbers displayed as well as the binary tree the
*           numbers were added to displayed. The expected input for the add
*           function of the T class is an integer. The expected output for it is
*           a node added to the binary search tree. There is no expected input 
*           for the getRoot function, and the expected output is the root node 
*           of the tree. The expected input of the display function is a parent
*           node, and the expected output is the printed values of the binary
*           search tree in ascending order.
*Purpose of Each Class:
*           The purpose of the Node class is to create a LinkedList structure 
*           to store the values of the binary search tree. The purpose of the T
*           class is to create a binary search tree that can add and display
*           values.
*/

package bstree;

import java.util.*;

public class BSTree {

//    Pre conditions:
//              The main method does not accept any parameters, but generates 
//              100 random integers from 1-99.
    public static void main(String[] args) {
        Random rand=new Random();
        int[] numberList= new int[100];
        T treeList=new T();
        for(int i=0; i<100; i++){
            numberList[i]=rand.nextInt(99+1);
            System.out.print(numberList[i]+" ");
            treeList.add(numberList[i]);
        }
        System.out.println();
        treeList.display(treeList.getRoot());
    }
//    Post conditions:
//              The main method does not return anything, but prints out the 
//              two lists of numbers.
    
}
