
public class Person {

	public int ageOfDeath;
	public int yearOfDeath;
	public int totalYear;
	
	public int isValid() {
		int result = yearOfDeath - ageOfDeath;
		if ( (result < 0) || (yearOfDeath < 0) || (ageOfDeath < 0) ) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public void countYear() {
		totalYear = yearOfDeath - ageOfDeath;
	}
	
}
