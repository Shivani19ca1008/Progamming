// import java.util.Scanner;
// class P1{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int size = s.nextInt();
//         int sum =0;
//         int a[] = new int[size];
//         for(int i=0;i<a.length;i++){
//             a[i] = s.nextInt();
//             sum = sum + a[i];
//         }
//         System.out.println(sum);
//     }
// }
import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int sum=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("The sum is : "+sum);
        
    }
}