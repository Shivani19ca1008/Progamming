import java.util.Scanner;
public class Fact{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact = 1;
        for(int i=0;i<=n;i++){
            if(i%2==0){
               fact = fact*i;
               System.out.println(fact);
            }
        }
    }
}