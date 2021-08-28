
public class Rule {

	public int peopleKilled;
	
	public void peopleWillKilled(int deathYear) {
		int pk = 1;
		
		for (int i=0; i<deathYear; i++) {
			pk = pk + i;
		}
		
		peopleKilled = pk;
	}
	
	private double average(int total, Rule pk[]) {
		int temp = 0;
		double average = 0;
		for (int i=0; i<total; i++) {
			temp = temp + pk[i].peopleKilled;
		}
		return average = (double)temp / total;
	}
	
	//Count average and show the result
	public void result(int totalPerson, Person people[], Rule aturan[]) {
		Rule result = new Rule();
		double average = result.average(totalPerson,aturan);
		
		int pers = 0;
		for (int i=0; i<totalPerson; i++) {
			pers = pers+1;
			System.out.println("Person" + pers + " born on Year = " + people[i].yearOfDeath + " - " + people[i].ageOfDeath + 
					" = " + people[i].totalYear + ", number of people killed on year " + people[i].totalYear + 
					" is " + aturan[i].peopleKilled);
		}
		
		System.out.println("So the average is = " + average);
	}
	
}
