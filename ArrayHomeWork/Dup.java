public class Dup {
    public static void main(String[] args) {
        int [] a = {1,1,2,2,3,3,4,4,5,6,7,8,9};

        for(int i=0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
