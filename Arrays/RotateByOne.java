public class RotateByOne {
    public static void main(String[] args) {
        
      int arr[]={3,5,1,7,5,9};
        int k=arr[0];
    for(int i=1;i<arr.length;i++){
        arr[i-1]=arr[i];
    }
    arr[arr.length-1]=k;
    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
  }
}
