package NumberCounter;

public class P1 {
    public static void main(String[] args) {
        int num = 4567;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            if(rem%2==0){
              sum = sum+rem;
            }
        }
        System.out.println(sum);
    }
}
