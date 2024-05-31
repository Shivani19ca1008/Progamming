package String;

public class SubString2 {
    public static void main(String[] args) {
        String s = "qspiders@gmail.com";
        System.out.println(s.substring(0,s.indexOf("@")));
        System.out.println(s.substring(s.indexOf(s.charAt(0)),s.indexOf('@')));
        System.out.println(s.substring(s.indexOf("@")+1,s.indexOf(".")));
    }
}
