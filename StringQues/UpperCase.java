package StringQues;

public class UpperCase {
    public static void main(String[] args) {
        String s = "shivani";
        char c [] = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='a'&&c[i]<='z'){
                c[i]=(char)(c[i]-32);
            }
        }
       
            System.out.println(c);
        

    }
}
