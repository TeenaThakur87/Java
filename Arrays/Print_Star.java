public class Print_Star {

        static void star(int arr[],int max){
            int k=max;
    
            for(int i=0;i<max;i++){
                for(int j=0;j<arr.length;j++){
                    if(arr[j]>=k){
                        System.out.print("* ");
                    
                    }
                    else{
                        System.out.print("  ");
                }
    
             }
                k=k-1;
                System.out.println();
    
            }
        }
    
        static int maxValue(int arr[]){
            int max=arr[0];
            for(int i=1;i<arr.length;i++){
                if(max<=arr[i]){
                    max=arr[i];
                }
            }
            return max;      
        }
            public static void main(String[] args) {
            int arr[]={2,4,1,0,6,7};
            int max=maxValue(arr);
            star(arr, max);
        }  
    }
    
