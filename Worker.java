//class Worker - represent a worker
public class Worker implements Comparable<Worker> {
	//variables of worker
	private String firstName;
	private String lastName;
	private String id;
	private int birthYear;

	//constructor - initialize all variables 
	public Worker(String firstName, String lastName, String id, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.birthYear = year;
	}

	@Override//the only method to be override in Comparable interface
	public int compareTo(Worker other) {
		//the var that use the method is bigger
		if (other == null) {
			return 1;
		}

		return id.compareTo(other.id);
	}

	@Override//create string of worker details to be printed
	public String toString() {
		return "First Name: " + firstName + "| Last Name: " + lastName + "| ID: " + id + "| Year of birth: "
				+ birthYear;
	}

	
}
