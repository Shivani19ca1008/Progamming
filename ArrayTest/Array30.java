package ArrayTest;

public class Array30 {
    public static void main(String[] args) {
        int a[] = {2,3,4,54,23,29,4,1};
        int temp =0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                 if(a[i]>a[j]){
                   temp = a[i];
                   a[i]= a[j];
                   a[j] = temp;
                 }
            }
        }
        
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
