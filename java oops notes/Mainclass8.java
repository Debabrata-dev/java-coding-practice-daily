class Sample{
Sample(){
    System.out.println("Ridie bycycle");
}
Sample(int a){
  
    System.out.println("RIde Bike");
}
Sample(double b){
    this();
    System.out.println("Ride the car");
}
}


public class Mainclass8{
    public static void main(String[] args) {
      Sample s=new Sample();
      Sample s1=new Sample(2); 
      Sample s2=new Sample(8.9);
    }
}