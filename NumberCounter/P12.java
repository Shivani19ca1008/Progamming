package NumberCounter;
class P12{
    public static void power(int n,int p){
        int power=1;
        while(p>0){
            power=power*n;
            p--;
        }
        System.out.println("Power of "+n+" is: "+power);
    }
    public static void main(String[] args) {
        int n=1234;
        int c=0;
        int n1=n;
        int p=2;
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
        int spr=0;
        while(n1!=0){
            int t= n1%10;
            if(mid!=0){
                mid--;
                spr = spr*10+t;
            }
            n1=n1/10;
        }
        int sp=0;
        while(spr!=0){
            int t= spr%10;
            sp = sp*10+t;
            spr=spr/10;
        }
        power(sp, p);
    }
}