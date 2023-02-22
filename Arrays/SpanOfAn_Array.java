public class SpanOfAn_Array {

    static int maxValue(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        return max;      
    }
    static int minValue(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            min=Math.min(min, arr[i]);
        }
        return min;
    }
    static int spanIs(int min,int max){
        return max-min;
    }
    public static void main(String[] args) {
        
        int arr[]={2,4,6,1,5,0,7,8,13};
        int min=minValue(arr);
        int max=maxValue(arr);
        int span=spanIs(min, max);

        System.out.println("min is: "+min);
        System.out.println("max is: "+max);
        System.out.println("span of an array is: "+span);
        
    }
}
