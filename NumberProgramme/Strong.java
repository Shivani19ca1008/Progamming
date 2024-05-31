package NumberProgramme;
class Strong{
   
        public static int fact(int n){
            int fact =1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            return fact;
    }
    
    public static void main(String[] args) {
        int n =145;
        int n1=n;
        int sum=0;
        while(n!=0){
            int temp = n%10;
            sum+=fact(temp);
            n=n/10;
        }
        if(n1==sum){
            System.out.println("strong number");
        }
        else{
            System.out.println("not");
        }
    }

}