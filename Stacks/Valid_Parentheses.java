import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char paren=str.charAt(i);
            if(paren=='{' || paren=='[' || paren=='('){//opening
                s.push(paren);
            }
            else{//close
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='(' && paren==')' 
                    || s.peek()=='{' && paren=='}'
                    || s.peek()=='[' && paren==']'){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        else{
            return true;
            }
      }
    public static void main(String[] args) {
        String str="{{}}()[]";
        System.out.println(isValid(str));
    }
}
