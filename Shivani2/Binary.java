package Shivani2;

public class Binary {
    public static void main(String[] args) {
        int a[] = {4,5,6,2,1};
        for(int i=0;i<a.length;i++){
         for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
         }
        }
        int n=3;
        int start =0;
        int end = a.length-1;
        int mid = (start+end)/2;
        while(start<end){
            if(a[mid]==2){
                System.out.println("prwse");
                break;
            }
            else if(a[mid]<n){
                start = mid+1;
            }
            else if(a[mid]>n){
               end = mid-1;
            }
        }


    }
}
