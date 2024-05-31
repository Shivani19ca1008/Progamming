package String;
class Convertlowertoupper{
    public static void main(String[] args) {
        String s = "hello";
        String s1 = convertToUpper(s);
        System.out.println(s1);
    }
    public static String covertToUpper(String input){
        char a[] = input.toCharArray();
        for(int i=0;i<a.length;i++){
            if( a[i]>='a' && a[i]<='z'){
               a[i] = (char)(a[i]-32);
            }
        }
        return new String(a);
    }
}