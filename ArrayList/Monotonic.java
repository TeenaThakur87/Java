import java.util.*;
public class Monotonic {
    public static boolean isMonotonic(ArrayList<Integer>A) {
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<A.size()-1;i++) {
            if(A.get(i) >A.get(i+1))
            inc=false;
            if(A.get(i) <A.get(i+1))
            dec=false;
        }
        return inc||dec;
       
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(10);
        height.add(20);
        System.out.println(isMonotonic(height));
    }    
}
