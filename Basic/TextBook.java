package Basic;

public class TextBook {
	
int id;
String title;
String aurthor;
int edition;
double price;

public TextBook(int id,String title,String aurthor,int edition,double price) {
	this.id=id;
	this.title=title;
	this.aurthor=aurthor;
	this.edition=edition;
	this.price=price;
}
public String toString() {
	return " "+this.id+" "+this.title+" "+this.aurthor+" "+this.edition+" "+this.price; 
}

}
