package edu.hm.cs.swe2.chore.chores;

public class Chore {

	private final String[] chore = { "Klo Putzen", "Küche wischen", "Abspülen",
			"Kochen" };

	
	//nochmal �berpr�fen Morteza
	String[] getChore(int index) {
		return chore;
	}

//	public void printChore(Chore index) {
//		for(int i = 0; i < chore.length; i++)
//		{
//		
//		System.out.println("Name " + i + ": " + chore[i]); 
//		}
//	}
	
	//nochmal 1) c genau durchlesen
	void printChore(int index){
		System.out.println(chore);
	}
	
	
	int getNumberOfChores(){
		
		return chore.length;
	}

	
}
