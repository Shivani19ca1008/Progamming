package String;

public class convertIntoCharArray {
    public static void main(String[] args) {
        String inp = "Hello world";
        char c[] = convertor(inp);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    public static char[] covertor(String s){
        char[] a= new char[s.length()];
        for(int i=0;i<s.length();i++){
            a[i] = s.charAt(i);
        }
        return a;
    }
}
