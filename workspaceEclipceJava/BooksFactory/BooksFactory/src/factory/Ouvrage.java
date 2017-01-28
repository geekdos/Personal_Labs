package factory;

import ouvrage.*;

public class Ouvrage extends Book {
	public Ouvrage(String title, String author, int pagesNbr, String languag) {
		super(title, author, pagesNbr, languag);
	}
	
	@Override
	public Book create(String gender) {
		if(gender.equals("ComputerScience")){
			this.book = new OuvrageComputerScience(this.getTitle(), this.getAuthor(), this.getPagesNbr(), this.getLanguag());
		}else if(gender.equals("Science")){
			this.book = new OuvrageScience(this.getTitle(), this.getAuthor(), this.getPagesNbr(), this.getLanguag());
		}
		return book;
	}
	
	@Override
	public void show() {}

	@Override
	public String getType() {
		return "Ouvrage ";
	}

}
