package StringQues;

public class ConvertStringIntoArray {
    public static void main(String[] args) {
        String s = "shivani";
        char a[] = new char[s.length()];
        for(int i=0;i<a.length;i++){
            a[i] = s.charAt(i);
            System.out.print(a[i]+" ");
        }
    }
}
