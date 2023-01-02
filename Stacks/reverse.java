import java.util.Stack;

public class reverse {
    public static void pushAtBottom(Stack<Integer>s,int data){
    if(s.isEmpty()){
        s.push(data);
        return;
    }
    int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
 }

    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void print(Stack<Integer>s){
        while(!s.isEmpty()){
        System.out.println(s.pop());
        
        }
    } 
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);        
        reverseStack(s);
        //original: 5 4 3 2 1
         System.out.printf("reversed:\n");
            print(s);     
    }
}
