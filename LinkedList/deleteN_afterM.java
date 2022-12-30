public class deleteN_afterM {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }

    }
        public static Node head;
        public static Node tail;

        public static Node push(Node head,int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            return head;
        }
        
        public  void deleteN(int M,int N,Node head){
            Node curr=head, t;
            int count;
            while(curr!=null){
                for(count=1;count<M && curr!=null;count++){
                    curr=curr.next;
                    if(curr==null){
                        return;
                    }
                }
                t=curr.next;
                if(t==null){
                    return;
                }
                for(count=1;count<=N && curr!=null;count++){
                    Node temp=t;
                    t=t.next;
                    if(t==null){
                        return;
                    }
                }
                curr.next=t;
                curr=t;
            }


        }
    
    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");


    }

    public static void main(String[] args) {
        deleteN_afterM list=new deleteN_afterM();
        Node head=null;
        int M=2,N=2;
        head=push(head, 10);
        head=push(head, 9);
        head=push(head, 8);
        head=push(head, 7);
        head=push(head, 6);
        head=push(head, 5);
        head=push(head, 4);
        head=push(head, 3);
        head=push(head, 2);
        head=push(head, 1);
        System.out.printf("before deletion: \n");
        list.print(head);
        list.deleteN(M, N, head);
        System.out.printf("after deletion: \n");
        list.print(head);
        
    }
    
}
