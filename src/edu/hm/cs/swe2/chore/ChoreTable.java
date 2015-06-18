package edu.hm.cs.swe2.chore;

import java.util.Random;

import edu.hm.cs.sw2.inhabitant.Inhabitant;

public class ChoreTable {

	private Chore chore;
	private Week week;
	private int weekCount;
	private String[] choresToDo = new String[chore.getNumberOfChores()];

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

	}

	public void fillChoreTable(Inhabitant inhabitant) {

		System.out.println("Zuteilen der Bewohner zu den Aufgaben: ");

		Random inhabitantsGenerator = new Random();

		int rndNum = inhabitantsGenerator.nextInt(inhabitant.getNumberOfInhabitants());
		for (int i = 0; i < rndNum; i++) {
			this.fillChoreTable(inhabitant);
		}
	}

	public void printChoreTable() {
		
		System.out.println("Woche" + "\\" + "Aufgabe\t" + "Klo Putzen\t" + "Küche wischen\t" + "Abspülen\t" + "Kochen\t" + "\n"
		+ week + "\t");

	}
}
