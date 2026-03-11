package Trees;

public class InsertBst {
    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(7);
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        inorderTraversal(root);
        int val=23;
        Node rootduplicate=root;
        insertNode(rootduplicate,val);
    System.out.println();
        inorderTraversal(root);
    }
    public static Node insertNode(Node root,int val){
        if(root==null){
              return new Node(val);}
              if(val>root.data){
                root.right=insertNode(root.right,val);
              }
              else{
                root.left=insertNode(root.left,val);
              }
                   return root;}

public static void inorderTraversal(Node root){
    if(root==null){
        return;
    }
    inorderTraversal(root.left);
    System.out.print(root.data+" ");
    inorderTraversal(root.right);
}
}
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

