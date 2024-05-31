package NumberCounter;

public class P11 {

    static void pwr(int n, int p) {
        int pwr = 1;
        for (int i = 1; i <= p; i++) {
            pwr *= n;
        }
        System.out.println("Power of "+n+" is: "+pwr);
    }
    public static void main(String[] args) {
        int n = 378;
        int p = 3;
        int n1 = n, count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        
        int mid = 0;

        if (count % 2 == 0) mid = count / 2; else mid = (count / 2)+1;
        
        int first_part_rev = 0;
        
        while (n1 != 0) {
            
            int temp = n1 % 10;

            if (mid != 0) mid--; else first_part_rev = (first_part_rev*10)+temp;

            n1 /= 10;

        }
        int first_part = 0;
        while (first_part_rev != 0) {
            int temp = first_part_rev % 10;
            first_part = (first_part*10) + temp;
            first_part_rev /= 10;
        }

        pwr(first_part,p);

       
    }
}
