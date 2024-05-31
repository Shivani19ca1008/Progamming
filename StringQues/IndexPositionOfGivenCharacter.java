package StringQues;

public class IndexPositionOfGivenCharacter {
    public static void main(String[] args) {
        String s = "riya";
        char c = 'y';
        char a[] = s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]==c){
                System.out.println(i);
            }
        }
    }
}
