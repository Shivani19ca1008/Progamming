package Shivani2;

public class P3 {
   public static void main(String[] args) {
    char c = 'a';
    for(int i=0;i<5;i++){
        for(int j=5;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print(c+" ");
            c++;
        }
        System.out.println(" ");
    }
   } 
}
