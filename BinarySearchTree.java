

public class BinarySearchTree {
    Node root;
    BinarySearchTree(int data){
        root= new Node(data);
    }

    void insert(Node node, int data){
        if(node.data > data){
            if(node.left==null){
                node.left=new Node(data);
            }
            else{
                insert(node.left,data);
            }
        }
        else{
            if(node.right==null){
                node.right= new Node(data);
            }
            else{
                insert(node.right,data);
            }
        }
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

    void search(Node root,int data){
        if(root==null){
            System.out.println("Not found "+data);
            return;
        }
        if(root.data==data){
            System.out.println("Found "+data);
        }
        else{
            if(root.data > data){
                search(root.left,data);
            }
            else {
                search(root.right,data);
            }
        }
    }

    static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(5);
        bst.insert(bst.root,4);
        bst.insert(bst.root,9);
        bst.insert(bst.root,11);
        bst.insert(bst.root,2);
        bst.insert(bst.root,7);
        bst.insert(bst.root,12);
        bst.insert(bst.root,3);

        bst.inOrder(bst.root);
        System.out.println();
        bst.preOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println();

        bst.search(bst.root,10);
    }
}
