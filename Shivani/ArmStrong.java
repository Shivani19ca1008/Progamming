package Shivani;

public class ArmStrong {
    public static int cube(int a){
        int cube = (a*a*a);
        return cube;
    }
    public static void main(String[] args) {
        int n =153;
        int n1 =n;
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum = sum + cube(rem);
            n= n/10;
        }
        if(sum == n1){
            System.out.println("arm");
        }
        else{
            System.out.println("no");
        }
    }
}
