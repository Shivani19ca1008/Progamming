package NumberProgramme;

public class phibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 =1;
        int i=1;
        while(i<=10){
         System.out.print(n1+" ");
         int n3 = n1+n2;
        n1=n2;
        n2=n3;
        i++;
        }

    }
}
