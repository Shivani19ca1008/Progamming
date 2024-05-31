package Shivani2;

public class ZigZag {
    public static void main(String[] args) {
        int a[] = {3,4,5,6,7};
        int b[] = {8,9,1};
        int c[] = new int[a.length+b.length];
        int k =0;
        for(int i=0;i<c.length;i++){
            if(i<a.length){ 
                c[k++] = a[i];
            }
             if(i<b.length){
                c[k++] = b[i];
            }
            System.out.print(c[i]+" ");
        }
    }
}
