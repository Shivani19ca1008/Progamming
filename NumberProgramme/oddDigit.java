package NumberProgramme;

public class oddDigit {
    public static void main(String[] args) {
        int n = 21456;
        int count =0;
        int temp =0;
        while(n!=0){
            temp=n%10;
            n=n/10;
        }
        System.out.println(temp);
        
        if(temp%2==0){
            System.out.println("number starts with even number");
        }
        else{

        System.out.println("number start with odd number");
        }
    }
    
}
