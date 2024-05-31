package NumberCounter;
public class P14 {
    static void cube(int n) {
        System.out.println("cube of "+n+ " is "+ (n*n*n));
    }
    public static void main(String[] args) {
        int n = 12345;
        while (n != 0) {
            int temp = n % 10;
            cube(temp);
            n /= 10;
        }
    }
}