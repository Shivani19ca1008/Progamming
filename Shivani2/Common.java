package Shivani2;

public class Common {
    public static void main(String[] args) {
        int a[] = {3,4,5,7};
        int b[]={1,4,6};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                 System.out.println(a[i]);
                }
            }
        }
    }
}
