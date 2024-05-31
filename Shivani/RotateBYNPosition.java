package Shivani;

import java.util.Arrays;

public class RotateBYNPosition {
    public static void main(String[] args) {
        int a[] = {3,4,5,6,7};
        int n = 3;

        for (int i = 1; i <= n; i++) {
            int temp = a[0];
            for (int j = 1; j < a.length; j++) {
                a[j-1] = a[j];
            }
            a[a.length-1] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
