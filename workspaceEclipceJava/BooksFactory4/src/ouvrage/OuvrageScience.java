package ouvrage;

import factory.Ouvrage;

public class OuvrageScience extends Ouvrage{
	public OuvrageScience(String title, String author, int pagesNbr, String languag) {
		super(title, author, pagesNbr, languag);
	}

	@Override
	public void show(){
		System.out.println("A Science Ouvrage template was created successfully");
	}
	
	@Override
	public String getType() {
		return super.getType()+"Science";
	}
}
