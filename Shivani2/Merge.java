package Shivani2;

public class Merge {
    public static void main(String[] args) {
        int a[] = {3,4,5,6,7};
        int b[] = {8,9,1};
        int c[] = new int[a.length+b.length];
        int k =0;
        for(int i=0;i<a.length;i++){
          c[k++] = a[i];
        }
        for(int i=0;i<b.length;i++){
          c[k++] = b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
