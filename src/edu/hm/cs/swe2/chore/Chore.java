package edu.hm.cs.swe2.chore;

public class Chore {

	private final String[] chore = { "Klo Putzen", "KÃ¼che wischen", "AbspÃ¼len",
			"Kochen" };

	
	//nochmal überprüfen Morteza
	String getChore(int index) {
		return chore[index];
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
		System.out.println(getChore(index));
	}
	
	
	int getNumberOfChores(){
		
		return chore.length;
	}

	
}
