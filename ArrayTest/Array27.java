package ArrayTest;

public class Array27 {
    public static void main(String[] args) {
        
        int a[] = {4,5,6,7,8,2};
        int max = a[0];
        for(int i=0;i<a.length;i++){
           if(a[i]>max){
            max = a[i];
           }
        }
        System.out.println(max);
    }
}
