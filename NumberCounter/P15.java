package NumberCounter;
public class P15 {
    public static void main(String[] args) {
        int n = 12345, rev = 0;
        while (n != 0) {
            int temp = n % 10;
            rev = (rev*10) + temp;
            n /= 10;
        }
        System.out.println(rev);
    }
}
