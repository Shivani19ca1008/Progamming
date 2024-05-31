package Shivani;

public class MoveZeroToLeft {
    public static void main(String[] args) {
        int a[] = {4,0,5,0,6};
        int b[] = new int[a.length];
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
