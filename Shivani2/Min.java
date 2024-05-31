package Shivani2;

public class Min {
    public static void main(String[] args) {
        int[] a= {3,4,5,2,7};
        int min = a[0];
        for(int i=0;i<a.length;i++){
           if(a[0]<min){
               min = a[0];
           }
        }
        System.out.println(min);
    }
}
