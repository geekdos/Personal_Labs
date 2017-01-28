package manga;

import factory.Manga;

public class MangaAction extends Manga {
	
	public MangaAction(String title, String author, int pagesNbr, String languag) {
		super(title, author, pagesNbr, languag);
	}

	@Override
	public void show(){
		System.out.println("An Action Manga template was created successfully");
	}
	@Override
	public String getType() {
		super.getType();
		return "Action";
	}
}
