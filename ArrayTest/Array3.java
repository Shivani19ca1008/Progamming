package ArrayTest;

public class Array3 {
    public static void main(String[] args) {
        int a[] = {2,3,4,5};
        int sum =0;
        int avg =0;
        int pro=1;
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
            avg = sum/a.length;
        }
        System.out.println(avg);
    }
}
