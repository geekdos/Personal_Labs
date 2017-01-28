package romans;

import factory.Romans;

public class RomanDrama extends Romans{
	public RomanDrama(String title, String author, int pagesNbr, String langue) {
		super(title, author, pagesNbr, langue);
	}

	@Override
	public void show(){
		System.out.println("A Drama Roman template was created successfully");
	}
	
	@Override
	public String getType() {
		return super.getType()+"Drama";
	}
}
