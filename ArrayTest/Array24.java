package ArrayTest;

public class Array24 {
    public static void main(String[] args) {
        int a[] = {2,3,4,0,5,3,0,9};
        int b[] = new int[a.length];
        int k=a.length-1;
        for(int i=a.length-1;i>=0;i--){
                if(a[i]!=0){
                 b[k--] = a[i];
                }
            }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
