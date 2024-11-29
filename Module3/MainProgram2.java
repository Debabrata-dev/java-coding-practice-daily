package Module3;

public class MainProgram2 {

	public static void main(String[] args) {
		TextBook[] books=new TextBook[5];
	     books[0]=new TextBook(1,"JAVA","Pawan",1,230.4);
	     books[1]=new TextBook(2,"SQL","Sarat",2,330.4);
	     books[2]=new TextBook(3,"WEB","Harish",3,430.4);
	     books[3]=new TextBook(4,"LP","Samer",4,530.4);
	     books[4]=new TextBook(5,"DSA","Darashan",5,630.4);
	     
	     System.out.println("Element of an array");
	     System.out.println("--------------------");
	     for(int i=0;i<books.length;i++) {
	    	 if(books[i].price>400)
	    	 System.out.println(books[i].id+"\t"+books[i].title+"\t"+books[i].author+"\t"+books[i].price);
	     }
	}

}
