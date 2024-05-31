
package NumberCounter;

public class P4 {
    public static void main(String[] args) {
        int num = 4067;
        boolean flag = false;
        while(num!=0){
            int rem = num%10;
            if(rem == 0){
               flag = true;
            }
            num=num/10;
        }
        if(flag==true){
            System.out.println("duck");
        }
        else{
            System.out.println("not");
        }
        
    }
}
