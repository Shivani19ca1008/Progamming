package Shivani;

public class PrimeArray {
    public static boolean prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        else{
           return false;
           
        }
    }
    
    public static void main(String[] args) {
        int a[] = {3,4,5};
        for(int i=0;i<a.length;i++){
            if(prime(a[i])){
                System.out.println(a[i]);
            }
        }
    }
}
