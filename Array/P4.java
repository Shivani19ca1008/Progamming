package Array;
import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = s.nextInt();
        int [] a = new int[size];
        System.out.println("enter the element of the first array");
        for(int i=0;i<size;i++){
             a[i] = s.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println("element of first array " +a[i]);
        }
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.println("element of second array " +b[i]);
        }

    }
}
