package SearchAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,14,56,6};
        int search =3;
        for(int i=0;i<a.length;i++){
            if(a[i] == search){
                System.out.println("number is found at"+i);
            }
        }
    }
}
