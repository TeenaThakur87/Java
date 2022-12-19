import java.util.ArrayList;

public class Pair_sum1 {
    //check that the given target of pair's sum is exist or not!!
    public static boolean ifExists(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }
            //if sum is less 
            if(list.get(rp)+list.get(lp)<target){
                lp+=1;
            }
            //if sum is greater
            else{
                rp--;
            }
        }
        //is target is not exists
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(ifExists(list, 5));
    }
    
}
