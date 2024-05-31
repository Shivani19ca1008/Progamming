package NumberProgramme;

public class ArmStrong {
    public static void cube(int n){
        int sum=0;
        int cube = n*n*n;
        sum = sum + cube; 
    }
    public static void main(String[] args) {
        int n= 1234;
        while(n!=0){
            int temp = n%10;
            if(cube(temp))
            n=n/10;
        }
    }
}
