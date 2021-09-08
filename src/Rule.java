
public class Rule {

	public int peopleKilled;
	
	public void peopleWillKilled(int deathYear) {
		int pk=1, n1=0, n2=1, n3=0;
		
		for (int i=1; i<deathYear; i++) {
			n3 = n1 + n2;
           		n1 = n2;
            		n2 = n3;
            		pk = pk + n3;
		}
		
		peopleKilled = pk;
	}
	
	private double average(int total, Rule pk[]) {
		int temp = 0;
		for (int i=0; i<total; i++) {
			temp = temp + pk[i].peopleKilled;
		}
		return (double)temp / total;
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
