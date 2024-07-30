package abstract_class_and_interface;


abstract class book{
	protected String name;
	protected String author;
	protected String price;
	
	public book(String name, String author, String price) {
		this.name= name;
		this.author = author ;
		this.price = price;
	}
	
	public abstract String getDetails();
}

class Mybook extends book{
	public Mybook(String name, String author,String price) {
		super(name, author, price);
	}
	
	public String getDetails() {
		return name+ ", " + author + ", "+ price;
	}
}


public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book newBook = new Mybook("1984","george orwell", "100");
		System.out.println(newBook.getDetails());

	}

}
