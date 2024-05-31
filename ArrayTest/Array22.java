package ArrayTest;

public class Array22 {
    public static void main(String[] args) {
        char c[] = {'a','b','c'};
        for(int i=0;i<c.length;i++){
            c[i] = (char)(c[i]-32);
            System.out.println(c[i]);
        }
    }
}
