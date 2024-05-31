import java.util.Scanner;

public class P9{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter Limit : ");
        // int size=sc.nextInt();
        // int a[]=new int[size];
        int a[] = {1,2,3,4,2,3,2};
        // for(int i=0;i<a.length;i++){
        //     a[i]=sc.nextInt();
        // }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]==a[j]&&i!=j){
                    System.out.print(a[i]+" ");
                }
            }
        }
        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=i;j<a.length;j++)
        //     {
        //         if(a[i]==a[j]&&i!=j)
        //             System.out.print(a[i]+" ");
        //     }
        // }
        
    }
}