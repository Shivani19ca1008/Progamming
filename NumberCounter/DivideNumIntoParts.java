package NumberCounter;

public class DivideNumIntoParts {
    public static void main(String[] args) {
        int n=3456;
        int n1=n;
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        int mid=0;
        if(c%2==0){
           mid = c/2;
        }
        else{
            mid = (c/2)+1;
        }
        int fp=0;
        int lp =0;
        while(n1!=0){
            int t = n1%10;
            if(mid!=0){
                mid--;
                lp = lp+t;
            }
            else{
                fp=fp+t;
            }
            n1=n1/10;
        }
        System.out.println("first part" +fp+"second part" +lp);
    }
}
