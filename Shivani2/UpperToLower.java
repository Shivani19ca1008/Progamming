package Shivani2;

public class UpperToLower {
    public static void main(String[] args) {
        char c[] = {'A','B','C'};
        for(int i=0;i<c.length;i++){
            c[i] = (char)(c[i]+32);
            System.out.println(c[i]);
        }
    }
}
