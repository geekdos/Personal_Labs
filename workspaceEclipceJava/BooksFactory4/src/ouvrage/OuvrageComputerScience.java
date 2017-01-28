package ouvrage;

import factory.Ouvrage;

public class OuvrageComputerScience extends Ouvrage {
	public OuvrageComputerScience(String title, String author, int pagesNbr, String languag) {
		super(title, author, pagesNbr, languag);
	}

	@Override
	public void show(){
		System.out.println("A ComputerScience Ouvrage template was created successfully");
	}
	
	@Override
	public String getType() {
		return super.getType()+"ComputerScience";
	}
}
