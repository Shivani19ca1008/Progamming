package Shivani;

public class RotateByNpositionRight {
    public static void main(String[] args) {
        int n =3;
        int a[] = {3,4,5,23,3};
        for(int i=1;i<=n;i++){
            int temp = a[a.length-1];
            for(int j=a.length-1;j>0;j--){
                a[j-1] = a[j];
            }
           a[0] = temp;
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
