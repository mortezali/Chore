package edu.hm.cs.sw2.inhabitant;

public class Inhabitant {

	private String[] names;

	public void printInhabitant(int index) {
		
		System.out.println(names[index]);

	}

	// 1. es wird kein Parameter übergeben
	// 2. for schleife hat falsche Syntax => sie macht nichts
	// 3. Am besten mit Hilfsvariable arbeiten
	public void printInhabitants() {

		// for (int i = 0; i < name.length; i++){
		// System.out.printf("In der WG wohnen " + name[index]);
		// }
		// Lösungsvorschlag Paul:
		String output = "In der WG wohnen ";
		for (int i = 0; i < getNumberOfInhabitants(); i++) {
			output += names[i];
			if (i < names.length - 1) {
				output += ", ";
			}
		}
		output += ".";
		System.out.println(output);

	}

	// Hier ist Konstruktor!!
	// Deklarierung der Objektvarieable (hier unser Array!)
	public Inhabitant(String[] name) {

		// pauls Lösungsvorschlag:

		this.names = new String[name.length];
		for (int i = 0; i < name.length; i++) {
			this.names[i] = name[i];
		}
		printInhabitants();


	}

	// public static String[] name = new String[];

	// for(int i = 0; i < name[index].length(); i++){}

	// es wird String returned und kein String Array
	public String getName(int index) {
		return names[index];
	}

	// kein Parameter verlagnt
	public int getNumberOfInhabitants() {
		return names.length;

	}

	public void addInhabitant(String name) {
		
		String[] newNames = new String[getNumberOfInhabitants() + 1];
		// for(String names : name){
		for (int i = 0; i < newNames.length; i++){
			if (i == newNames.length -1){
				newNames[i] = name;
				System.out.println(newNames[i] +" zieht neu in die WG ein.");
			}else{
				newNames[i] = name;
			}
		}
			this.names = newNames;
		printInhabitant();

		// von paul:
		// String[] newNames = new String[getNumberOfInhabitants() + 1];
		// for (int i = 0; i < newNames.length; i++) {
		// if (i == newNames.length - 1) {
		// newNames[i] = name;
		// System.out.println(newNames[i] +" zieht neu in die WG ein.");
		// } else {
		// newNames[i] = names[i];
		// }
		// }
		// this.names = newNames;
		// printInhabitants();

	}

//	public void removeInhabitant(String[] name) {
//
//		System.out.println("heute zieht" + name + "aus");
//		String[] temp = new String[name.length];
//		int tempSize = 0;
//		for (int i = 0; i < name.length; i++) {
//			if (name[i] != null) {
//				{
//					temp[tempSize++] = name[i];
//					String[] result = new String[tempSize];
//					System.arraycopy(temp, 0, result, 0, tempSize);
//					System.out.println(result);
//
//				}
//
//			}
//
//		}
//
//	}
	 public void removeInhabitant(String name){
		 String[] newNames = new String[getNumberOfInhabitants()-1];
		 int tempNumber = 0;
		 for(int i = 0; i<getNumberOfInhabitants(); i++){
		 if(getInhabitant(i).equals(name)){
		 tempNumber--;
		 System.out.println(name + " zieht heute aus der Wg aus.");
		
		 } else {
		 newNames[tempNumber] = name;
		 }
		 tempNumber++;
		 }
		
		 this.names = newNames;
		 printInhabitants();
		 }
		
		

	// public void changeInhabitant(String oldIn, String newIn){
	// for (int i = 0; i<getNumberOfInhabitants(); i++){
	// if(getInhabitant(i).equals(oldIn)){
	// names[i] = newIn;
	// System.out.println("Für " + getInhabitant(i) + " zieht " + newIn
	// +" neu in die WG ein.");
	// }
	// }
	// }
	public void changeInhabitant(String oldName, String newName){
	 
	//System.out.println("heute zieh " + name + "aus und " + newName + "zieht ein");
	for (int i = 0; i <getNumberOfInhabitants(); i++){
		
		if(getInhabitant(i).equals(names)){
		names[i] = newName;
		
		System.out.println("Für " + getInhabitant(i) + " zieht " + newName + " neu in die WG ein.");
	}
	}
	
}

	private Object getInhabitant(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
