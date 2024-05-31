package Shivani2;

public class Duplicate {
    public static void main(String[] args) {
        int a[] = {3,4,5,6,7,3};
        for(int i=0;i<a.length;i++){
          for(int j=i+1;j<a.length;j++){
            if(a[i]==a[j]){
                System.out.println(a[i]);
            }
          }
        }
    }
}
