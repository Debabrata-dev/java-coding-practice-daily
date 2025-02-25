package Thread_Program;

public class Syncronized {
	 synchronized void read() {
		System.out.println("Read");
	}
	
public static void main(String[] args) {
Syncronized s1=new Syncronized();
Syncronized s2=new Syncronized();
s1.read();
s2.read();
}
}
//SYNCRONIZED
//it is the concept of makeing resource thread safe
//we can perfrom syncronized in java using syncronized keyword .
//if a method or resource declare with syncronized .it can only be use in one thread at a time 
