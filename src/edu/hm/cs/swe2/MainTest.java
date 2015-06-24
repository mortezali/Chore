package edu.hm.cs.swe2;

import java.util.Random;

import edu.hm.cs.sw2.inhabitant.Inhabitant;
import edu.hm.cs.swe2.chore.Week;
import edu.hm.cs.swe2.chore.chores.ChoreTable;

public class MainTest {

	public static void main(String[] args) {

		String[] names = new String[] {"Josef", "Simon", "Adam", "Maria"

		};
		Inhabitant in = new Inhabitant(names);
		
		ChoreTable ct = new ChoreTable(new Week(30, 2015), 7);
		ct.fillChoreTable(in);
		ct.printChoreTable();
		
			
			
		
	}

}
