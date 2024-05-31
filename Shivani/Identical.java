package Shivani;

public class Identical {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {6,7,8,9};
        int flag=0;
        if(a.length!=b.length){
            System.out.println("Not Identical");
        }
        else{
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            System.out.println("Not Identical");
            else
            System.out.println("Identical");
        }
        
        
    }
}