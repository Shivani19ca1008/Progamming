package Shivani2;

public class StrongNumber {
    public static int fact(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n =678;
        int sum =0;
        int n1 =n;
        while(n!=0){
            int rem = n%10;
            sum = sum+fact(rem);
            n = n/10;
        }
         if(sum ==n1){
            System.out.println("strong");
         }
         else{
            System.out.println("no");
         }
    }
}
