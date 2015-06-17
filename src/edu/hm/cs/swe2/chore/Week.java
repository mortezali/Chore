package edu.hm.cs.swe2.chore;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Week {
	public int week;

	public int year;

	public Week(int week, int year) throws Exception{
		this.year = year;
		if (week < 1){
			throw new InvalidWeekFigureException("Week shouldn´t be lower than 1.");
		
			
		}else if(week > 52){
			throw new InvalidWeekFigureException("Week shouln´t be higher than 52.");
			
		}
		else{
			this.week = week;
		}
	}

	public String toString() {

		return getWeek() + "/" + getYear();
	}

	public int getYear() {
		return year;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getWeek() {
		return week;
	}
	// GregorianCalendar cal = new GregorianCalendar();
	// String week = Integer.toString(cal.get(GregorianCalendar.WEEK_OF_YEAR));

	// public void printCalender(){
	//
	// System.out.print(cal.get(Calendar.WEEK_OF_YEAR));
	// }

}
