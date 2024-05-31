package Shivani2;

public class ReverseOfArray {
    public static void main(String[] args) {
        int a[] = {3,4,5,6,7};
        for(int i=0,j=a.length-1;i<a.length/2;i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for(int i:a){
            System.out.println(i);
        }

    }
}
