import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		//INPUT TOTAL PERSON
		int totalPerson = 0;
		try {
			System.out.print("Total person: ");
			totalPerson = myObj.nextInt();
		}
		catch(Exception e) {
			System.out.println("Please input number!");
		}
		
		if (totalPerson>0) {
			//INPUT AGE AND VALIDATE
			int pers = 0;
			int isValid = 0;
			Person[] people = new Person[totalPerson];
			for (int i=0; i<totalPerson; i++) {
				pers = i + 1;
				people[i] = new Person();
				
				try {
					System.out.println("Person" + pers + ":");
					System.out.print("Age of Death = ");
					people[i].ageOfDeath = myObj.nextInt();
						
					System.out.print("Year of Death = ");
					people[i].yearOfDeath = myObj.nextInt();
				}
				catch(Exception e) {
					isValid = -1;
					System.out.println(isValid);
					break;
				}
				
				isValid = people[i].isValid();
				if (isValid<0) {
					System.out.println(isValid);
					break;
				} 
				else {
					people[i].countYear();
				}
			}
			
			System.out.println(" ");
			
			if (isValid==0) {
				//RULE
				Rule[] aturan = new Rule[totalPerson];
				for (int i=0; i<totalPerson; i++) {
					aturan[i] = new Rule();
					aturan[i].peopleWillKilled(people[i].totalYear);
				}
				
				//ANSWER
				Rule resultForWitch = new Rule();
				resultForWitch.result(totalPerson, people, aturan);
			}
		}
		else {
			System.out.println("-1");
		}
		
	}

}
