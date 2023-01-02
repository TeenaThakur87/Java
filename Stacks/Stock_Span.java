import java.util.Stack;

public class Stock_Span {
    
    public static void stockSpan(int Stock[], int Span[]){
        Stack<Integer> s=new Stack<>();
        Span[0]=1;
        s.push(0);
        for(int i=1;i<Stock.length;i++){
            int currPrice=Stock[i];
            while(!s.isEmpty() && currPrice >= Stock[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                Span[i]=i+1;
            }
            else{
                  int preHigh=s.peek();
                  Span[i]=i-preHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int Stock[]={100,80,60,70,60,85,100};
        int Span[]=new int[Stock.length];
        
        System.out.printf("Stock: ");
        for(int i=0;i<Stock.length;i++){
            System.out.printf(Stock[i]+" ");
        }
        stockSpan(Stock, Span);

        System.out.printf("\nSpan: ");
        for(int i=0;i<Span.length;i++){
            System.out.printf(Span[i]+" ");
        }
    }
}
