package Shivani2;

public class countLowerCaseAndSpcial {
    public static void main(String[] args) {
        String s = "shi v@RT1";
        char c[] = s.toCharArray();
        int count = 0;
        for(int i=0;i<c.length;i++){
            if(!((c[i]>='A' && c[i]<='Z') ||  c[i]>='0' && c[i]<='9' || c[i]==' ')){
              count++;
            }
        }
        System.out.println(count);

    }
}
