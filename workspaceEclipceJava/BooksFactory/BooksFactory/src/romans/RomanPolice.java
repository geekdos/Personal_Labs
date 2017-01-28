package romans;

import factory.Romans;

public class RomanPolice extends Romans {
	public RomanPolice(String title, String author, int pagesNbr, String langue) {
		super(title, author, pagesNbr, langue);
	}

	@Override
	public void show(){
		System.out.println("A Police Roman template was created successfully");
	}
	
	@Override
	public String getType() {
		return super.getType()+"Police";
	}
}
