package edu.hm.cs.swe2.chore.chores;

import java.util.Random;

import edu.hm.cs.sw2.inhabitant.Inhabitant;
import edu.hm.cs.swe2.chore.Week;
import edu.hm.cs.swe2.chore.exception.NoWeeksToPlanException;

public class ChoreTable {

	private Chore chore;
	private Week week;
	private int weekCount;
	private String[] choresToDo;

	public ChoreTable(Week week, int weekCount) {

		this.week = week;
		this.weekCount = weekCount;

		try {

			if (weekCount <= 0) {
				this.weekCount = 4;
				throw new NoWeeksToPlanException();

			} else {
				this.weekCount = weekCount;
			}

		} catch (Exception ex) {
			System.out
					.println("Fehler bei der Eingabe. Der Anzahl der Wochen darf nicht negativ sein oder null.");

		}
		chore = new Chore();
		this.choresToDo = new String[chore.getNumberOfChores()];

	}
	
	public int randomNumber(Inhabitant inhabitant){
		int randomNumber = 0;
		Random inhabitantsGenerator = new Random();
		randomNumber = inhabitantsGenerator.nextInt(inhabitant.getNumberOfInhabitants());
		
		
		
		return randomNumber;
	}

	//Zuteilung f�r nur eine Woche
	public void fillChoreTable(Inhabitant inhabitant) {

		System.out.println("Zuteilen der Bewohner zu den Aufgaben: ");
		
		
		
		for (int i = 0; i < choresToDo.length; i++) {
			
			int rndNum = randomNumber(inhabitant);

			choresToDo[i] = inhabitant.getName(rndNum) + "\t\t";
			
		}
	}

	
	// Ist noch nicht komplett.
	// 
	public void printChoreTable() {
		
		// Das stimmt hier noch nicht. du musst automatisch alle Aufgaben da hinschreiben lassen.
		// nicht Hard codiert in den Code.
		System.out.println("Woche" + "\\" + "Aufgabe\t" + "Klo Putzen\t" + "Küche wischen\t" + "Abspülen\t" + "Kochen\t");

		// Mach z.B. eine Schleief und geb die Aufgaben dann alle aus.
		
		
	}
}
