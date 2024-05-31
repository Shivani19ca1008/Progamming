package Array;

public class ZigZag {
    public static void main(String[] args) {
        int a[]= {1,2,3};
        int b[] = {4,5,6};
        int c[] = new int[a.length+b.length];
        int k=0;
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[k++] = a[i];
            }
            if(i<b.length){
                c[k++] = b[i];
            }
        }
        for(int i: c){
            System.out.println(i);
        }
    }
}
