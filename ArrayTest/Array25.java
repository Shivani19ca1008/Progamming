package ArrayTest;

public class Array25 {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,0,9,0};
        int b[] = new  int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[k++] = a[i];
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
