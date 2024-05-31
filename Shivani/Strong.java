package Shivani;

public class Strong {
    public static int fact(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact *i;
        }
          return fact;
    }
    public static void main(String[] args) {
        int n =23;
        int sum =0;
        while(n!=0){
           int rem = n%10;
           sum += fact(rem);
           n = n/10;

        }
        if(sum == n){
           System.out.println("strong");
        }
        else{
            System.out.println(" not strong");
        }
      
    }
}
