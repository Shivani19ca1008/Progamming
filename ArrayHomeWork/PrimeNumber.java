public class PrimeNumber {
    public static boolean prime(int a){
        int c=0;
        // int flag = true;
        for(int i=1;i<=a;i++){
          if(a%i==0){
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
        int a [] = {1,2,3,4,56,7};
        boolean isprime;
        for(int i=0;i<a.length;i++){
          isprime = prime(a[i]);
          if(isprime){
            System.out.println(a[i]+" ");
          }
        }
    }
}
