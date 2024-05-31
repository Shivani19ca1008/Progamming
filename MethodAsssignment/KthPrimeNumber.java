package MethodAsssignment;
public class KthPrimeNumber {
    public static boolean prime(int a){
    int c=0;
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
        int k =5;
        int count = 0;
        int end = 100;
        for(int i=1;i<=end;i++){
         
           if(prime(i)){
            count++;
           }
            if(k==count){
                System.out.print(i);
                break;
            }
           
        }
       
    }
}
