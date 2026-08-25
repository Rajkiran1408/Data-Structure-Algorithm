package src.data_structure_algorithm;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}

public class BinaryTree {
    Node root;


    void insert(int data){
        root = new Node(data);
    }

    void insertLeft(Node node,int data){
         node.left= new Node(data);
    }

    void insertRight(Node node , int data){
        node.right = new Node(data);
    }
    void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    static void main(String[] args) {
        BinaryTree bt= new BinaryTree();
        bt.insert(1);
        bt.insertLeft(bt.root,2);
        bt.insertRight(bt.root,3);
        bt.insertLeft(bt.root.right,7);
        bt.insertRight(bt.root.right,8);

        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
    }
}
