

public class SeriesPrime {
    public static boolean prime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
         int start = 10;
         int end = 100;
         for(int i=start;i<=end;i++){
          if(prime(i)) {
                System.out.print(i+" ");
            }
         }  
    }
}