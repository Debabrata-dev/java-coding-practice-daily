class Bottle{
   int capacity;
   Bottle(int capacity){
    this.capacity=capacity;
   }}
public class Parrametrized {
    public static void main(String[] args) {
        Bottle s1=new Bottle(750);
        System.out.println(s1.capacity);
    }}
