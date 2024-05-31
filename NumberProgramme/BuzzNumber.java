package NumberProgramme;

public class BuzzNumber {
    public static void buzzNumber(int num){
        if(num%7==0||num%10==0){
          System.out.println("buzz number");
        }
        else{
            System.out.println("not ");
        }
    }
    public static void main(String[] args) {
        buzzNumber(566);
    }
}
