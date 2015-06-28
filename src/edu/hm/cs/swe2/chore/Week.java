package edu.hm.cs.swe2.chore;

import edu.hm.cs.swe2.chore.exception.IllegalWeekException;
import edu.hm.cs.swe2.chore.exception.WeekTooHighException;
import edu.hm.cs.swe2.chore.exception.WeekTooLowException;

public class Week {
	public int week;

	public int year;

	final static int WEEKS_OF_YEAR = 52;

	public Week(int week, int year)  throws Exception{
		this.year = year;
		try {
			setWeek(week);
		} catch (WeekTooLowException e) {
			this.week = 1;

		} catch (WeekTooHighException e) {
			this.week = week%WEEKS_OF_YEAR;
			this.year += week%WEEKS_OF_YEAR;
			
		}
	}

	// public int addWeeks(int figuresOfWeek) throws Exception{
	//
	// if (week > WEEKS_OF_YEAR ){
	// throw new InvalidWeekFigureException
	// ("Week shouln´t be higher than 52.");
	// }
	// return this.week + figuresOfWeek;
	//
	// }
	public Week addWeeks(int figuresOfWeek) throws Exception{
		Week newWeek;
		try {
			
			if(week<1){
				throw new WeekTooLowException();
			}
			newWeek = new Week(getWeek()+figuresOfWeek, getYear());
		} catch (IllegalWeekException e) {
			// TODO Auto-generated catch block
		return this;
		}
		
		return newWeek;
	}

	public String toString() {

		return getWeek() + "/" + getYear();
	}

	public int getYear() {
		return year;
	}

	public void setWeek(int week) throws IllegalWeekException {
		if (week < 1) {
			throw new WeekTooLowException(
					"Week shouldn´t be lower than 1.");

		} else if (week > WEEKS_OF_YEAR) {
			throw new WeekTooHighException(
					"Week shouln´t be higher than 52.");

		} else {

			this.week = week;
		}

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
