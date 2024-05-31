
package MethodAsssignment;
import java.util.Scanner;
public class Even {
    public static void even(int n){
        if(n%2==0){
          System.out.println("even");
        }
        else{
          System.out.println("odd");
        }
      }
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int start = 1;
        
        even(n);
    }
}
