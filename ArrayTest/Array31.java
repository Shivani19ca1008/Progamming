package ArrayTest;

public class Array31 {
    public static void main(String[] args) {
        int a [] = {1,2,4,5,3};
        int temp =0;
       for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
               temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
        }
    }
    int c =0;
    for(int i=0;i<a.length;i++){
        c++;
        if(c==2){
            System.out.println(a[i]);
            break;
        }
    }

    }
}
