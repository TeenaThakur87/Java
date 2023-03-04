public class RunningSum {

    static int[] Runningsum(int arr[],int a[]){
        
        a[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            a[i]=a[i-1]+arr[i];
        }
        return a;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int a[]=new int[arr.length];
        Runningsum(arr,a);
        //to print running sum
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
