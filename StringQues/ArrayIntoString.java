package StringQues;

public class ArrayIntoString {
    public static void main(String[] args) {
      char a[]  = {'a','b','c'};
      StringBuilder s = new StringBuilder();
      for(int i=0;i<=a.length-1;i++){
       s = s.append(a[i]);
      }
      System.out.println(s);
    }
}
