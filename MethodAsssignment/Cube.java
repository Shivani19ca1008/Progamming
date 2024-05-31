package MethodAsssignment;

import java.util.Scanner;

public class Cube {
    public static void cube(int a){
       int sq = a*a*a;
       System.out.println(sq);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        cube(n);
    }

}
