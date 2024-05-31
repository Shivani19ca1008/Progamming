package Array;

import java.util.Arrays;

// import java.util.Scanner;
public class RotatingArray {
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,6};
        // int temp = a[0];
        //     for(int i=0;i<a.length-1;i++){
        //         a[i] = a[i+1];
        //     }
        //     a[a.length-1] = temp;

            int i =a.length-1;
            int temp = a[a.length-1];
            for(;i>0;i--){

                a[i]=a[i-1];
            }
            a[0]=temp;
            for( i=0;i<a.length;i++){
                System.out.print(a[i] +" ");
            }
            // System.out.println(Arrays.toString(a) );
           
        
    }
}
