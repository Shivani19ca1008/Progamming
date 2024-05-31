package ArrayTest;

public class Array33 {
    public static void main(String[] args) {
        int a[] = {3,4,5,67,2};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
              temp = a[i];
              a[i] = a[j];
              a[j] = temp;
            }
        }
        int n=7;
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==n){
                System.out.println("n is present");
            }
            else if(a[mid]<n){
                 start = mid+1;
            }
              else if(a[mid]>n){
                end = mid-1;
              }
            else{
                System.out.println("not is present");
            }
        }
    }
}
