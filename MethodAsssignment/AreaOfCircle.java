
package MethodAsssignment;
import java.util.Scanner;
public class AreaOfCircle {
    public static void area(int r){
        float f = 22/7f;
        float area = f*r*r;
        System.out.println(area);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        area(n);
    }
}
