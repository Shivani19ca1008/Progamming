package ArrayTest;

public class Array10 {
    public static void main(String[] args) {
        int a[] = {2,3};
        int b[] = {3,4,5,6,7,4};
        int flag =0;
            if(a.length!=b.length){
                System.out.println("not identical");
            }
            else{
                for(int i=0;i<a.length;i++){
                    if(a[i]!=b[i]){
                      flag = 1;
                      break;
                    }
                }
            
            if(flag==1){
                System.out.println("not identical");
            }
            else{
                System.out.println("identical");
            }
        }
    }
}
