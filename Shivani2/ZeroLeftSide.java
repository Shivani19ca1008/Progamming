package Shivani2;

public class ZeroLeftSide {
    public static void main(String[] args) {
        int a[] = {3,4,0,5,0,7};
        int b[] = new int[a.length];
        int k =a.length-1;
        for(int i = a.length-1;i>0;i--){
             if(a[i]!=0){            
               b[k--] = a[i];
             }
        }
       for(int i:b){
        System.out.println(i);
       }
    }
}
