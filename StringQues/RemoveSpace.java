package StringQues;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "sh iva";
        StringBuilder result = new StringBuilder();
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] != ' '){
             result.append(c[i]);
            }
        }
        System.out.println(result);
     }
}
