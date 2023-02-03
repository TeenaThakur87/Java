import java.util.*;

public class BinaryNum {
    static void printBinary(int n){
        Queue<String> q=new LinkedList<>();
        q.add("1");
        while(n-->0){
            String s1=q.peek();
            q.remove();
            System.out.print(s1+" ");
            q.add(s1+"0");
            q.add(s1+"1");
        }
    }
    public static void main(String[] args) {
        printBinary(5);
    }
}
