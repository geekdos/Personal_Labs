package factory;

import romans.*;

public class Romans extends Book {
		
	public Romans(String title, String author, int pagesNbr, String langue) {
		super(title, author, pagesNbr, langue);
	}

	@Override
	public Book create(String gender) {
		if(gender.equals("Drama")){
			this.book = new RomanDrama(this.getTitle(), this.getAuthor(), this.getPagesNbr(), this.getLanguag());
		}else if(gender.equals("Police")){
			this.book = new RomanPolice(this.getTitle(), this.getAuthor(), this.getPagesNbr(), this.getLanguag());
		}
		return book;
	}

	@Override
	public void show() {}

	@Override
	public String getType() {
		return "Roman ";
	}
}
