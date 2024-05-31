package NumberCounter;

public class P13 {
    public static void main(String[] args) {
        int n =1234;
        int fact=1;
        while(n>0){
            int rem = n%10;
            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
           n=n/10;
        }
        System.out.println(fact);
    }
}
