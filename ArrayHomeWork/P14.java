import java.util.Scanner;

public class P14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(i%2!=0)
                 sum= sum+a[i];
                System.out.print(sum+" ");
        }
        
    }
}