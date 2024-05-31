package Array;
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        int b[] = {7,8,9,6};
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("enter the " +  i   + " element");
            a[i] = s.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
