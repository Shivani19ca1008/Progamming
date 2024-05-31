package MethodAsssignment;

import java.util.Scanner;

public class Power {
    public static void power(int base,int power){
       int res =1;
       while(power>0){
        res = res * base;
        power--;
       }
       System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = s.nextInt();
        power(n,n1);
    }
}

//using for loop
// int base = 2;
// int power = 4;
// int res = 1;
// for(int i=1;i<=power;i++){
//     res = res*base;
// }
// System.out.println(res);
