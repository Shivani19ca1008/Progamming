package Shivani2;

public class ArmStrong {
        public static void main(String[] args) {
        int n =153;
        int sum = 0;
        int n1 = n;
        while(n!=0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if(sum == n1){
           System.out.println("arm");
        }
        else{
            System.out.println("not");
        }
    }
}
