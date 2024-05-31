public class leftside {
   
public static void main(String[] args) {
    int a[] = {3,4,5,6,7};
    int n = 3;

    for (int i = 1; i <= n; i++) {
        int temp = a[0];
        for (int j = a.length-1; j > 0; j--) {
            a[j-1] = a[j];
        }
        a[0] = temp;
    }

    for(int i:a){
        System.out.println(i);
    }
}
}
