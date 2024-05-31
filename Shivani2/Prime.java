package Shivani2;

public class Prime {
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
        for(int i=0;i<=30;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
        
    }
}
