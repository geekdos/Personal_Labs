package facade;

import factory.*;

public class Facade {
		
	public static Book createBook(String type, String gender, String title, String author, int pagesNbr, String langue) {
		if(type.equals("Romans")){
			return new Romans(title, author, pagesNbr, langue).create(gender);
		}else if(type.equals("Manga")){
			return new Manga(title, author, pagesNbr, langue).create(gender);
		}else if(type.equals("Ouvrage")){
			return new Ouvrage(title, author, pagesNbr, langue).create(gender);
		}
		
		return null;
	}
// 
	
}
