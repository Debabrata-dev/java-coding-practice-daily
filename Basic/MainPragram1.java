package Basic;

public class MainPragram1 {
public static void main(String[] args) {

	 System.out.println("Book Details");
	 System.out.println("----------------");
	 TextBook[] books=new TextBook[5];
	 books[0]=new TextBook(222,"Java","Pavan",2,100.0);
	 books[1]=new TextBook(221,"Sql","Sarat",3,190.0);
	 books[2]=new TextBook(220,"Web","Pavan",1,150.0);
	 books[3]=new TextBook(219,"Lp","Pavan",4,250.0);
	 books[4]=new TextBook(218,"Dsa","Pavan",5,350.0);
	 
	 System.out.println("ID\tTitle\tAurthor\tedition\tprice");
	 for(int i=0;i<books.length;i++) {
		 System.out.println(books[i].id+"\t"+books[i].title+"\t"+books[i].aurthor+"\t"+books[i].price);
	 }
	 System.out.println("-------------");
}
}