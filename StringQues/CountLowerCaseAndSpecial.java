package StringQues;

public class CountLowerCaseAndSpecial {
    public static void main(String[] args) {
        String s = "shiva&*niTH";
        char c[] = s.toCharArray();
        int count = 0;
        for(int i=0;i<c.length;i++){
            if((c[i]>='A'&&c[i]<='Z')&&(c[i]>='0'&&c[i]<='9')){
                  count =0;
                  
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}
