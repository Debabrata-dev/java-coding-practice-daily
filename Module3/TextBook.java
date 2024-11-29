package Module3;

public class TextBook {

	int id,edition;
	String title,author;
	double price;
	
  public TextBook(int id,String title,String author,int edition,double price) {
	 this.id=id;
	 this.title=title;
	 this.author=author;
	 this.edition=edition;
	 this.price=price;
 }
  public String toString() {
	  return " "+this.id+","+this.title+","+this.author+","+this.edition+","+this.price;
  }
}

