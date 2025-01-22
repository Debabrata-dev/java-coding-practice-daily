class Demo{
    final int A=90;
  final void play(){
    System.out.println("playig");
  }
}
class Sample extends Demo{
    // @Override
    // void play(){
    //     System.out.println("playing cricket");
    // }
}
public class MainFinal {
    public static void main(String[] args) {
      Demo d1=new Demo();
      System.out.println(d1.A);
     d1.play();
    }
}
///when ever a method is declare using final key word we cannot overiden the method in the superclass .
/// final keyword we use to stope modiffication .
