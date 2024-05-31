package Shivani2;

public class UpperCase {
    public static void main(String[] args) {    
        String s = "shivani";
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++){
            c[i] = (char)(c[i]-32);
        }
        for(char i:c){
         System.out.println(i);
        }
      
    }
}
