package ArrayTest;

public class Array2 {
    public static void main(String[] args) {
        int a[] = {2,3,4,5};
        int pro=1;
        for(int i=0;i<a.length;i++){
            pro = pro+a[i];
        }
        System.out.println(pro);
    }
}
