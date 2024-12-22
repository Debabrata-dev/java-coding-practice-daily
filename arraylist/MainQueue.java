import java.util.PriorityQueue;
public class MainQueue {
    public static void main(String[] args) {
   PriorityQueue q1=new PriorityQueue<>();
   System.out.println("--".repeat(20));
   q1.add(23);
   q1.add(1);
   q1.add(2);
   q1.add(3);
   q1.add(45);
   q1.offer(67);
   System.out.println(q1);
   System.out.println("--".repeat(20));
   q1.poll();//it is use to delet
   q1.offer(45);
   q1.element();//it gives execption if queue is empty
   q1.peek();//it didnot gives excpetion it gives use null
   System.out.println(q1);
   System.out.println(q1.peek());
    }
}
