package StringQues;

public class LastFourChar {
    public static void main(String[] args) {
        // String s = "nitin";
        // String rev = "";
        // for(int i=s.length()-1;i>=0;i--){
        //   rev = rev + s.charAt(i);
        // }
        // String s = "shivani";
        // char c[] = s.toCharArray();
        // for(int i=c.length-1;i>=0;i--){
        //    System.out.println(c[i]);
        // }
        String s = "shivani";
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        char c[] = rev.toCharArray();
        for(int i=0;i<=3;i++){
            System.out.println(c[i]);
        }

    }
}
