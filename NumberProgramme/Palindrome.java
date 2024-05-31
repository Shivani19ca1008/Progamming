package NumberProgramme;
public class Palindrome {
    public static void main(String[] args) {
        int n =121;
        int n1 = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(rev==n1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
