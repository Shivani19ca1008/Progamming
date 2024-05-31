package MethodAsssignment;

import java.util.Scanner;

public class Sqaure {
    public static void square(int a){
       int sq = a*a;
       System.out.println(sq);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        square(n);
    }

}
