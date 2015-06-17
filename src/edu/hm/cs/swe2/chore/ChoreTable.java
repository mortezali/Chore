package edu.hm.cs.swe2.chore;

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

	}



}
