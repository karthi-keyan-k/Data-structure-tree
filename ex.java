import java.util.*;
class treenode{
    int value;
    treenode left,right;
    treenode(int value){
        this.value=value;
        left=right=null;

    }

}
    

public class ex {
    public void preorder(treenode node){
        if(node==null)
        return;
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(treenode node){
        if(node==null)
        return;
        inorder(node.left);
        System.out.print(node.value+" ");
        
        inorder(node.right);
    }
    public void postorder(treenode node){
        if(node==null)
        return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
        
        
    }
    
    public static void main(String[] args){
        treenode root=new treenode(1);
        root.left = new treenode(2);
        root.right = new treenode(3);
        root.left.left = new treenode(4);
        root.left.right = new treenode(5);
        root.right.left = new treenode(6);
        root.right.right = new treenode(7);
        root.left.right.left = new treenode(8);
        root.right.right.left = new treenode(9);
        root.right.right.right = new treenode(10);
        ex tree =new ex(+);
        System.out.print("preorder:");
        tree.preorder(root);
        System.out.println();
        System.out.print("inorder:");
        tree.inorder(root);
        System.out.println();
        System.out.print("postorder:");
        tree.postorder(root);
        System.out.println();

        


    }
}
