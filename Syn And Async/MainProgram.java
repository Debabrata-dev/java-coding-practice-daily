public class MainProgram {
void read(){
    System.out.println("Reading");
}
synchronized void write(){
    System.out.println("Write");
}
public static void main(String[] args) {
        MainProgram a1=new MainProgram();
        MainProgram a2=new MainProgram();
    
    a1.read();
    a2.read();
    a1.write();
    a2.write();
    }
}