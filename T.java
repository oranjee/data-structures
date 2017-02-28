package bstree;

public class T {
    
    private static Node root;
    private static int height;
    
//    Pre conditions:
//              The T constructor does not accept any parameters.
    public T(){
        root=null;
        height=0;
    }
//    Post conditions:
//              The T constructor does not return anything.
    
//    Pre conditions:
//              The add function accepts an integer to be added to the tree as a
//              parameter.                
    public void add(int data){
        //check if root node exists
        if(root==null){
            root=new Node(data);
            
        }else{
        
            Node current=root;
            Node temp=new Node(data);
        
            if(current!=null){
                //search for next available spot to place new node at
                while(true){
                    //add to left if data is less than current node or to right 
                    //if data is more than current node
                    if(data<=current.getData()){
                        if(current.getLeftChild()==null){
                            current.setLeftChild(temp);
                            break;
                        }
                        current=current.getLeftChild();
                    }else if(data>current.getData()){
                        if(current.getRightChild()==null){
                            current.setRightChild(temp);
                            break;
                        }
                        current=current.getRightChild();
                    }
                }
            }
        }
    }
//    Post conditions:
//              The add function does not return anything, but adds a node to 
//              the binary search tree.
    
//    Pre conditions:
//              The getRoot function does not accept any parameters.
    public Node getRoot(){
        return root;
    }
//    Post conditions:
//              The function returns the root node of the binary search tree.
    
//    Pre conditions:
//              The display function accepts a parent node as a parameter.                
    public void display(Node parent){
        if(root==null){
            System.out.println("The binary search tree is empty.");
        }else if(parent!=null){
            //System.out.println("test");
            display(parent.getLeftChild());
            System.out.print(parent.getData()+" ");
            display(parent.getRightChild());
        }
//        Post conditions:
//                  The function does not return anything, but prints the values
//                  of the binary search tree.
    }
    
    
}
