package Shivani2;

public class Identical {
    public static void main(String[] args) {
        int a[] = {3,4,5,7};
        int b[]={3,4,5};
        boolean flag = false;
        if(a.length!=b.length){
            System.out.println("not");
        }
        else{
            for(int i=0;i<a.length;i++){
              if(a[i]!=b[i]){
                flag = true;
                break;
              }
            }
            if(flag == true){
                System.out.println("not");
            }
            else{
                System.out.println("yes");
            }
        }

    }
}
