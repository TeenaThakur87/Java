import java.util.Stack;

public class duplicate_Parentheses {

    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(c);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(a+b)+(c+d)";
        System.out.println(isDuplicate(str));
    }
}
