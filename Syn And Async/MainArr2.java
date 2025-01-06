class Product{

}
class Mobile extends Product{
String name;
Mobile(String name){
    this.name=name;
}
public String toString(){
     return name;
}
}
class Talivision extends Product{
    String name;
    Talivision(String name){
   this.name=name;
    }
    public String toString(){
        return name;
    }
}
public class MainArr2 {
    public static void main(String[] args) {
        Product[] arr=new Product[5];
        arr[0]=new Talivision("Virat");
        arr[1]=new Mobile("Samsung");
        arr[2]=new Product();
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
     }
    }
}
