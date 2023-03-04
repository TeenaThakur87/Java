public class SecondMax {

    static int maxNum(int arr[]){
        int maximun=arr[0];
        for(int i=1;i<arr.length;i++){
            maximun=Math.max(maximun, arr[i]);
        }
        return maximun;
    }

    static int secondMax(int arr[],int max){
        int Smax=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<max){
                Smax=Math.max(Smax, arr[i]);
            }

        }
        return Smax;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2,5,6,7,12,4,11};
        int max=maxNum(arr);
        System.out.print("Second Max Element Of The Given Array Is: "+secondMax(arr, max));
    }
}
