package Shivani2;

public class Bubble {
    public static void main(String[] args) {
        int a[] = {4,5,2,3,6,7};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        int c=0;
        for(int i:a){
            c++;
            if(c==3){
                System.out.println(i);
            }
        }
    }
}
