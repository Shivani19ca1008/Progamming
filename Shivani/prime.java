package Shivani;

public class prime {
    public static void main(String[] args) {
        int n =5;
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not");
        }
    }
}
