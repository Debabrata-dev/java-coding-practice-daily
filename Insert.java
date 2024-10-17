public class Insert{
    void play(){
        System.out.println("playing");
    }
public static void main(String[] args) {
   int[] a={12,32,43,65,78};
   int post=3;
   int element=100;
   for(int i=a.length-1;i>post-1;i--){
   a[i]=a[i-1];
   } 
   a[post-1]=element;
for(int j=0;j<a.length;j++){
    System.out.print(a[j]+" ");
}
}}