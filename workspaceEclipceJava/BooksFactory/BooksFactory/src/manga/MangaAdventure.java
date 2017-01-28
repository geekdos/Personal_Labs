package manga;

import factory.Manga;

public class MangaAdventure extends Manga {

	public MangaAdventure(String title, String author, int pagesNbr, String languag) {
		super(title, author, pagesNbr, languag);
	}

	@Override
	public void show(){
		System.out.println("An Advanture Manga template was created successfully");
	}
	
	@Override
	public String getType() {
		return super.getType()+"Adventure";
	}
}
