package SotingArray;

public class ThirdMaximumElement {
    public static void main(String[] args) {
        int a[] = {23,4,5,1,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int k = a[i];
                    a[i] = a[j];
                    a[j] =k;
                }
            }
        }
        int c=0;
        for(int i=0;i<a.length;i++){
            c++;
            if(c==3){
                System.out.println("third max element "+a[i]);
                break;
            }
        }
    }
}
