package edu.hm.cs.swe2.chore;


	/**
	 *
	 */

	 
	import java.util.Calendar;
	import java.util.Date;
	import java.util.GregorianCalendar;
	import java.util.Locale;
	 
	/**
	 * 
	 *
	 */
	public class CalendarWeekExample {
	 
	    /**
	     * @param args
	     */
	    public static void main(final String[] args) {
	        final CalendarWeek calendarWeek = new CalendarWeek(37,Locale.GERMANY);
	        System.out.println(calendarWeek.getStart());
	        System.out.println(calendarWeek.getEnd());
	    }
	 
	    static class CalendarWeek {
	        int weekOfYear;
	 
	        Date start;
	 
	        Date end;
	 
	        public CalendarWeek(final int weekOfYear,final Locale locale) {
	            this.weekOfYear = weekOfYear;
	 
	            final GregorianCalendar calendar = new GregorianCalendar(locale);
	            final int CURRENT_YEAR = calendar.get(Calendar.YEAR);
	            calendar.clear();
	            calendar.set(Calendar.YEAR,CURRENT_YEAR);
	            calendar.set(Calendar.WEEK_OF_YEAR, this.weekOfYear);
	           
	            this.start = calendar.getTime();
	            calendar.add(Calendar.DAY_OF_MONTH, 6);
	            this.end = calendar.getTime();
	        }
	 
	        public Date getEnd() {
	            return end;
	        }
	 
	        public Date getStart() {
	            return start;
	        }
	 
	        public int getWeekOfYear() {
	            return weekOfYear;
	        }
	    }
	}


