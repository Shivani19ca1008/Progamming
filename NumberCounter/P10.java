package NumberCounter;
class P10{
    public static void main(String[] args) {
        int n=1234;
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
            mid=(c/2)+1;
        }
        int fp=0;
        int sp=0;
        while(n1!=0){
            int t=n1%10;
            if(mid!=0){
                mid--;
                sp=t;
            }
            else{
                fp=t;
            }
          n1=n1/10;
        }
        System.out.println("first number" +fp +"second number" +sp);
        if(sp%2==0){
            System.out.println("start with even"+fp);
     }
        else{
            System.out.println("start with odd"+fp);
         }
    }
}