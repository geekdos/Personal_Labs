package factory;

public abstract class Book {
	
	private String author;
	public static int counter;
	public String isbn;
	protected Book book;
	private String title;
	private int pagesNbr;
	private String languag;
	
	public Book(String title, String author, int pagesNbr, String languag) {
		super();
		this.author = author;
		this.title = title;
		this.pagesNbr = pagesNbr;
		this.languag = languag;
		counter++;
		isbn = this.getType()+"_"+counter;
	}
	
	public abstract Book create(String gender);
	public abstract void show(); // This method is used by the template
	public abstract String getType(); // This method is used by the template
	
	// This is the Template Method
	public void showTemplate(){
		System.out.println("-----------------------------------------");
		System.out.println("--> The Factory Of "+this.getType()+" <--");
		System.out.println("-----------------------------------------");
		System.out.println("The title is           : "+this.getTitle());
		System.out.println("The author             : "+this.getAuthor());
		System.out.println("The ISBN is            : "+this.getIsbn());
		System.out.println("The number of pages is : "+this.getPagesNbr());
		System.out.println("The Langugeis          : "+this.getLanguag());
		this.show();
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return this.author;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPagesNbr() {
		return pagesNbr;
	}
	public void setPagesNbr(int pagesNbr) {
		this.pagesNbr = pagesNbr;
	}
	public String getLanguag() {
		return languag;
	}
	public void setLanguag(String languag) {
		this.languag = languag;
	}
	public String getIsbn() {
		return isbn;
	}
}
