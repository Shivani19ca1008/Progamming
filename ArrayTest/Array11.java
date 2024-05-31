package ArrayTest;

public class Array11 {
    public static void main(String[] args) {
        int a[] = {2,3,4,5};
        int index = 2;
        int value = 6;
        for(int i=0;i<a.length;i++){
            if(i==index){
                a[i] = value;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
