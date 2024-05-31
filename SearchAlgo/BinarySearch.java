package SearchAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        int [] a={1,21,34,4,53,2,7,67};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int start =0;
        int end = a.length-1;
        int n=7;
        while(start<=end){
          int mid = (start+end)/2;
          if(a[mid]==n){
            System.out.println("n is present in given array");
            break;
          }
          else if(a[mid]<n){
            start = mid+1;
          }
          else if(a[mid] >n){
            end = mid -1;
          }
        
        }
    }
}
