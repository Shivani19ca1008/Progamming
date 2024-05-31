package ArrayTest;

public class Array32 {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,78,34,21};
        int search =3;
        for(int i=0;i<a.length;i++){
          if(a[i]==search){
            System.out.println(i);
          }
        }
    }
}
