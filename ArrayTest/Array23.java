package ArrayTest;

public class Array23 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        int b[] = {5,6,7,8};
        int c[] = new int[a.length+b.length];
        int k=0;
        int sum=0;
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[k++]=a[i] ;
            }
            if(i<b.length){
                c[k++]=b[i] ;
            }
        }
        for(int i=0;i<c.length;i++){
            sum = sum+c[i];
        }
        System.out.println(sum);
    } 
}
