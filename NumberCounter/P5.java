package NumberCounter;

public class P5 {
    public static void main(String[] args) {

        int n = 2346, n1 = n, count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        
        int mid = 0;

        if (count % 2 == 0) 
        {mid = count / 2;}
        else {
         mid = (count / 2)+1;
        }
        
        int first_number = 0, second_number =  0;
        
        while (n1 != 0) {
            
            int temp = n1 % 10;

            if (mid != 0) {
                mid--;
                second_number += temp;
            } else {
                first_number += temp;
            }

            n1 /= 10;
        }
        
        System.out.println("First half: "+first_number+" Second half: "+second_number);
    }
}
