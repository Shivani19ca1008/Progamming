package Shivani2;

public class RFemoveSpace {
    public static void main(String[] args) {
        String s = "abc d";
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                s1 += s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
