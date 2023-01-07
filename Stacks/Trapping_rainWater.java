import java.util.HexFormat;
import java.util.Stack;

public class Trapping_rainWater {
    public static int maxWater(int height[]){
        Stack<Integer> stack=new Stack<>();
        int temp=0;
        for(int i=0;i<height.length;i++){
                while ((!stack.isEmpty())&& (height[stack.peek()] < height[i])) {
                int pop_height=height[stack.peek()];
                stack.pop();
                if(stack.isEmpty())
                break;
                int distance = i - stack.peek() - 1;
                int min_height= Math.min(height[stack.peek()],height[i])
                - pop_height;
                temp += distance * min_height;}stack.push(i);
            }return temp;
            
            
        }
    
    public static void main(String[] args) {
        int arr[]={4,2,0,4,6,5,7,4};
        System.out.println(maxWater(arr));
    }
    
}
