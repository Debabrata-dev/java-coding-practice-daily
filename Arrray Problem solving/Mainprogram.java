//Max number in an array
public class Mainprogram {
public static void main(String[] args) {
    int[] a={78,30,40,45,50,55,65};
    int max=a[0];
    int min=a[0];
    for(int i=0;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
        if(a[i]<min){
            min=a[i];
        }
    }
    System.out.println(min);
    System.out.println(max);
}
}