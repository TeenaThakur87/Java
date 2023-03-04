import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        int n=4; int m=6;
        Integer costVer[]={2,1,3,1,4};//m-1
        Integer costHor[]={4,1,2};//n-1

        Arrays.sort(costVer,Comparator.reverseOrder());
        Arrays.sort(costHor,Comparator.reverseOrder());

        int h=0; int v=0;
        int hp=1; int vp=1;
        int cost=0;

        while(h<costHor.length && v<costVer.length){
            if(costVer[v]<=costHor[h]){//horizonal cut
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }
            else{//vertical cut
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }

        while(v<costVer.length){
            cost+=(costVer[v]*hp);
            vp++;
            v++;

        }
        System.out.println("min cost of cuts = "+cost);

    }
}
