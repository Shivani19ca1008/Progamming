package SotingArray;

public class BubbleSort {
   // Ascending order
    // public static void main(String[] args) {
    //     int [] a={1,21,34,4,53,2,67};
    //     for(int i=0;i<a.length-1;i++){
    //         for(int j=i+1;j<a.length;j++){
    //             if(a[i]>a[j]){
    //                 int temp = a[i];
    //                 a[i] = a[j];
    //                 a[j] = temp;
    //             }
    //         }
    //     }
    //     for(int i:a){
    //         System.out.println(i);
    //     }
    // }
    // descending order
    public static void main(String[] args) {
        int [] a={1,21,34,4,53,2,67};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
