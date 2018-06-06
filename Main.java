/*
 * Author: Shai Gotlieb
 * Date: 23/05/2018
 */
import java.util.Iterator;

//class main
public class Main {
	public static void main(String[] args) {
		//create AssociationTable or workers
		AssociationTable associationTable = new AssociationTable<Worker, Double>();
		
		//create new workers
		Worker shai = new Worker("Shai", "Gotlieb", "305465924", 1990);
		Worker christiano = new Worker("Christiano", "Ronaldo", "204333991", 1985);
		Worker lionel = new Worker("Lionel", "Messi", "205556670", 1987);
		
		//add worker to the table
		associationTable.add(shai, 7500);
		associationTable.add(christiano, 350000000);
		associationTable.add(lionel, 280000000);
		associationTable.add(shai, 12300);
		
		//remove one of the worker
		associationTable.remove(shai);
		
		//iteration over table to print worker
		for (Iterator<Worker> iterator = associationTable.keyIterator(); iterator.hasNext();) {
			Worker worker = iterator.next();
			System.out.println(worker);
		}
	}//end of main
}//end of class Main
