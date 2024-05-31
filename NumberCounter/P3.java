package NumberCounter;
import java.util.Scanner;
public class P3 {
    public static boolean prime(int n){
        int ctr = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
               ctr++;
            }
        }
            if(ctr ==2){
                return true;
    
            }
            else{
               return false;
            }
          
        }
    
    public static void main(String[] args) {
       int n=4567;
       int sum =0;
       while(n>0){
        int rem = n%10;
          if(prime(rem)){
           sum = sum + rem;
          }
          n=n/10;
       }
    System.out.println(sum);
       
       }
    }

