import java.util.Scanner;

public class P2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int p=1;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            p*=a[i];
        }
        System.out.println("The product is : "+p);
        
    }
}
// int pro =1;
// int size = s.nextInt();
// int a[] = new int[size];
// for(int i=0;i<a.length;i++){
//     a[i] = s.nextInt();
//     pro = pro * a[i];
// }
