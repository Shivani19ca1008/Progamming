package ArrayTest;

public class Array17 {
   public static void main(String[] args) {
    int a[] = {2,3,4,5,6};
    int b[] = new int[a.length];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<b.length;j++){
            b[i] = a[i];
        }
    }
    for(int i=0;i<b.length;i++){
        System.out.println(b[i]);
    }
   } 
}
