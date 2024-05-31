package String;

public class ConvertUpperToLower {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = covertor(s);
        System.out.println(s1);
    }
    public static String convertor( String input){
         char a[] = input.toCharArray();
         for(int i=0;i<a.length;i++){
            if(a[i]>='A' && a[i]<='Z'){
                a[i] = (char)(a[i]+32);
            }
         }
         return new String(a);
    }
}
