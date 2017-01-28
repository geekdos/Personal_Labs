package app;

import facade.Facade;

public class Client {

	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		System.out.println("--> Welcome to HAKIMA BookFactory <--");
		System.out.println("-------------------------------------");
		
		//Factory calls with the facade structure Adventure
		Facade.createBook("Romans", "Police", "The laste crime", "Aguata Christe", 120, "Arabic").showTemplate();
		Facade.createBook("Ouvrage", "ComputerScience", "The internet", "Matheo Nebra", 500, "Français").showTemplate();
		Facade.createBook("Manga", "Adventure", "HunterXHnter", "Togachi", 174, "Japanaise").showTemplate();
	}

}
