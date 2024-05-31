package Shivani2;

public class CountSpecial {
    public static void main(String[] args) {
        String s1 = "shivani*";
        String s = s1.toLowerCase();
        int sp = 0,vowel=0,consonant=0;
        for(int i=1;i<s.length();i++){
            if(!(Character.isLetterOrDigit(s.charAt(i)))|| (Character.isWhitespace(s.charAt(i)))) {
               sp++;
            }
            else if(Character.isLetter(s.charAt(i))){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                  vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("special"+sp);
        System.out.println("vowel"+vowel);
        System.out.println("consonant"+consonant);

    }
}
