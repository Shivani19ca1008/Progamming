package StringQues;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "shivaniy";
       char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = i+1; j < c.length; j++) {
                if (c[i] == c[j]) {
                   c[j] = 0;
                }
            }
        }
        String s1 = "";
        for(char i=0;i<s.length();i++){
            if(c[i] != '0'){
               s1 +=c [i];
            }
        }
        System.out.println(s1);
        
    }

}
