package MethodAsssignment;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void circle(int r){
      float f = 22/7f;
      float circum = 2*f*r;
      System.out.println(circum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        circle(n);
    }
}
