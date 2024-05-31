package ArrayTest;

public class Array6 {
    public static void main(String[] args) {
        int a [] = {2,4,5,3,26,32};
        int pro=1;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                pro = pro*a[i];
            }
        }
        System.out.println(pro);
    }
}
