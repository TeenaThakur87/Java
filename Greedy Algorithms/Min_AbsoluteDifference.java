import java.util.Arrays;

public class Min_AbsoluteDifference {
    public static void absoluteDiff(int A[],int B[]){
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("min absolute difference of pairs = "+minDiff);

    }
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        int B[]={2,3,1,3};
        absoluteDiff(A, B);
    }
}
