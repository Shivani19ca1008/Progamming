package Shivani2;

public class DuplicateString {
    public static void main(String[] args) {
        String s = "shivani";
         boolean flag = false;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                   flag = true;
                } 
            }
        }
       
    }
}
