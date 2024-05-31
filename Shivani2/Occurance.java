package Shivani2;

public class Occurance {
    public static void main(String[] args) {
        String s = "shivani";
        char c[] = s.toCharArray();
        char n = 'i';
        int count =0;
         for(int i=0;i<c.length;i++){
            if(c[i]==n){
                count++;
            }
         }
         System.out.println(count);
    }
}
