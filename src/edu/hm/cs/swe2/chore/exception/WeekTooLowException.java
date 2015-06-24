package edu.hm.cs.swe2.chore.exception;

public class WeekTooLowException extends IllegalWeekException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WeekTooLowException(){
		
		
	}
	
public WeekTooLowException(String msg){
	
	super (msg);
}
}
