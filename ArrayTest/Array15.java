package ArrayTest;

public class Array15 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int temp =0;
        for(int start=0,end=a.length-1;start<end;start++,end--)
         {
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            
        }
        for(int i=0;i<=a.length;i++){
            System.out.println(a[i]);
        }
    }
}
