package ArrayTest;

public class Array1 {
    public static void main(String[] args) {
        int [] a={3,4,5,6,2,4};
        int c = 4;
        int count =0;
        for(int i=0;i<a.length;i++){
            if(a[i]==c){
              count++;
            }
        }
        System.out.println(count);
    }
}

