package Basic;

public class MainProgram4 {
public static void main(String[] args) {
	System.out.println("Book Details");
	 System.out.println("----------------");
	 TextBook[] books=new TextBook[5];
	 books[0]=new TextBook(222,"Java","Pavan",2,100.0);
	 books[1]=new TextBook(221,"Sql","Sarat",3,190.0);
	 books[2]=new TextBook(220,"Web","Harish",1,150.0);
	 books[3]=new TextBook(219,"Lp","Samier",4,250.0);
	 books[4]=new TextBook(218,"Dsa","Darshan",5,350.0);
	 
	 System.out.println("ID\tTitle\tAurthor\tedition\tprice");
	 for(int i=0;i<books.length;i++) {
		 if(books[i].title.equalsIgnoreCase("Java")  ||
				 books[i].title.equalsIgnoreCase("Lp") ||
				 books[i].title.equalsIgnoreCase("Dsa") 
				 )
		 System.out.println(books[i].id+"\t"+books[i].title+"\t"+books[i].edition+"\t"+books[i].aurthor+"\t"+books[i].price);
	 }
	 System.out.println("-------------");
}
}
