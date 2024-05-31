package Shivani2;

public class ConvertStringIntoArray {
    public static void main(String[] args) {
        String s = "shivani";
        char c[] = new char[s.length()];
        for(int i=0;i<c.length;i++){
            c[i] = s.charAt(i);
            System.out.println(c[i]);
        }
    }
}
