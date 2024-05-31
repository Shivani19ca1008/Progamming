package Shivani2;

public class LastFourChar {
    public static void main(String[] args) {
        String s = "shivani";
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        for(int i=0;i<4;i++){
            System.out.println(s1.charAt(i));
        }
    }
}
