package Shivani2;

public class Copy {
    public static void main(String[] args) {
        int a[] = {3,4,5,6,7};
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }
}
