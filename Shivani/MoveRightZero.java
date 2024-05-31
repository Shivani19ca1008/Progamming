package Shivani;

public class MoveRightZero {
    public static void main(String[] args) {
        int a[] = {4,0,5,0,6};
        int b[] = new int[a.length];
        int k=a.length-1;
        for(int i=a.length-1;i>0;i--){
            if(a[i]!=0){
                b[k--] = a[i];
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
