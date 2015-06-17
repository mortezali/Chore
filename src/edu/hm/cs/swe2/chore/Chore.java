package edu.hm.cs.swe2.chore;

public class Chore {

	private final String[] chore = { "Klo Putze", "Küche wischen", "Abspülen",
			"Kochen" };

	public String[] getChore(Chore index) {
		return chore;
	}

	public void printChore(Chore index) {
		for(int i = 0; i < chore.length; i++)
		{
		
		System.out.println("Name " + i + ": " + chore[i]); 
		}
	}
	
	public int getNumberOfChores(){
		
		return chore.length;
	}

	
}
