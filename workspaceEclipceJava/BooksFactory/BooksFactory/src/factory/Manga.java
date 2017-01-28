package factory;

import manga.*;

public class Manga extends Book{
	
	private int chapterNumber = 0;
	
	public Manga(String title, String author, int pagesNbr, String languag) {
		super(title, author, pagesNbr, languag);
	}

	@Override
	public Book create(String gender) {
		if(gender.equals("Action")){
			this.book = new MangaAction(this.getTitle(), this.getAuthor(), this.getPagesNbr(), this.getLanguag());
		}else if(gender.equals("Adventure")){
			this.book = new MangaAdventure(this.getTitle(), this.getAuthor(), this.getPagesNbr(), this.getLanguag());
		}
		return book;
	}

	public int getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(int chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	@Override
	public void show() {}

	@Override
	public String getType() {
		return "Manga ";
	}
	
	

}
