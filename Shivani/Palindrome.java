package Shivani;

public class Palindrome {
    public static void main(String[] args) {
        int n =789;
        int n1 = n;
        int rev = 0;
        while(n!=0){
            int rem = n%10;
             rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);
        if(rev == n1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("no");
        }

    }
}
