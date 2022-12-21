package lectureFunction;

public class Floyds{
    public static void Floyds(int a){
        int k=1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }System.out.println();
        }
    }

    public static void main(String[] args){
        Floyds(5);
    }
}
