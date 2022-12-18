import java.util.ArrayList;
public class CWMW_2PointerApproach {
    public static int Stored_Water(ArrayList<Integer> height){
        int maw_water=0;
        //lp=left pointer
        int lp=0;
        //rp=right pointer;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currentWater=ht*width;
            maw_water=Math.max(maw_water, currentWater);

            if(lp<rp){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maw_water;
    }

    
        public static void main(String[] args) {
            ArrayList<Integer> height=new ArrayList<>();
            height.add(1);
            height.add(8);
            height.add(6);
            height.add(2);
            height.add(5);
            height.add(4);
            height.add(8);
            height.add(3);
            height.add(7);  
            System.out.println(Stored_Water(height));
           }
    }
    

