package ArrayTest;
class Array14{
 public static void main(String[] args) {
    int a[] = {2,3,4,5,6};
    int index =2;
    for(int i=0;i<a.length;i++){
        if(index == i){
            a[i] = 0;
        }
        System.out.println(a[i]);
    }
 }
}