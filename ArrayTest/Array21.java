package ArrayTest;

public class Array21 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        int b[] = {5,6,7,8,1,2,4};
        boolean flag = false;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[i]){
                    flag = true;
                }
            }
        }
        if(flag == true){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
    }
}
