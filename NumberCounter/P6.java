package NumberCounter;

public class P6 {
    public static void power(int base,int power){
        int res = 1;
        while(power >0){
          res = res * base;
          power--;
        }
        System.out.println(res);
    }
    public static void digit(int n){
        while(n>0){
           int rem = n%10;
           if(rem%2==0){
            power(rem,3);
           }
            n=n/10;
        }
    }
    public static void main(String[] args) {
        digit(1234);
    }
}
