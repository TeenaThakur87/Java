import java.util.Stack;

public class NextGreater_element {

    public static void next_Greater(int arr[], int nextGreater[]){
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
            s.pop();
        
          }
        //if next greater doesn't exists..
        if(s.isEmpty()){
            nextGreater[i]=-1;
        }
        else{
            nextGreater[i]=arr[s.peek()];
        }
        s.push(i);
    }
}
    public static void main(String[] args) {
        int arr[]={21,1,10,4,3,6,12};
        int nextGreater[]=new int[arr.length];

        next_Greater(arr, nextGreater);
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
