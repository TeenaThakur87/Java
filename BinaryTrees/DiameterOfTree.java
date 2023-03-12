public class DiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static int heigth(Node root){
        if(root==null){
            return 0;
        }
        int lh=heigth(root.left);
        int rh=heigth(root.right);
        return Math.max(lh, rh)+1;
    }

    static int diameter(Node root){
        if(root==null){
            return 0;
        }

        int leftDiameter=diameter(root.left);
        int leftHeight=heigth(root.left);
        int rightDiameter=diameter(root.right);
        int rightHeight=heigth(root.right);
        int selfDiameter=leftHeight+rightHeight+1;

        return Math.max(selfDiameter,Math.max(rightDiameter, leftDiameter));
    }
        public static void main(String[] args) {
   /*
            
            1
          /   \
        2       3
       / \     / \
      4   5   6   7
              


  */

            Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            root.right.left=new Node(6);
            root.right.right=new Node(7);

            System.out.println(diameter(root));
        }
}
