package edu.hm.cs.swe2.chore.exception;

public class WeekTooHighException extends IllegalWeekException{
	
	public WeekTooHighException(){
		super();
	}
	
	public WeekTooHighException(String msg){
		super(msg);
	}
	
}
