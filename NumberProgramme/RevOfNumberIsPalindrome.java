package NumberProgramme;

public class RevOfNumberIsPalindrome {
    public static void rev(int n){
        int n1=n;
        int rev =0;
        while(n>0){
            int rem = n%10;
            rev = rev*0+rem;
            n = n/10;
        }
        if(n1 == rev){
            System.out.println("plaindrome");
        }
        else{
            System.out.println("not");
        }
    }
    public static void main(String[] args) {
        rev(123);
    }
}
