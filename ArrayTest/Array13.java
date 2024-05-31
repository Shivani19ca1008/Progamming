package ArrayTest;

public class Array13 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        for(int i=0;i<a.length;i++){
            int cube = a[i]*a[i]*a[i];
            System.out.println(cube);
        }
    }
}
