package Array;

public class MovingZeroAtTheLast {
    public static void main(String[] args) {
        int a[] = {10,0,8,2,0,4,0,1};
        int b[] = new int[a.length];
       int k =0;
        for(int i=0;i<a.length;i++){
            if(a[i] != 0){
              b[k++] = a[i];
            }
        }
        for(int i=0;i<b.length;i++){
             System.out.println(b[i]);
        }
    }
}
