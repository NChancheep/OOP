import java.util.Scanner;
public class ElectionTester 
{
	public static void main(String[] args) 
	{
		MyDate election = new MyDate(2019, 3, 24);
		
		Person a = new Person("Lalisa", "Manoban", 1997, 3, 27);
		printPersonElectionInfo(a, election);
		
		Person b = new Person("Nuda", "Inter", 2012, 1, 16);
		printPersonElectionInfo(b, election);
		
		// Create another Person object with your information
		// Print your information, age, and election eligibility.
		
		/*
		 * YOUR CODE GOES HERE
		 */
		Person c = new Person("Chancheep", "Mahacharoensuk", 2000, 12, 29);
		printPersonElectionInfo(c, election);
	
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter firstname or type 'q' to exit: ");
			String firstname =scanner.next();
			if(firstname.equals("q"))
			{
				System.out.println("Exit the program. Thank you.");
				break;
			}
			System.out.print("Enter lastname: ");
			String lastname =scanner.next();
			System.out.print("Enter year of birthday: ");
			int year =scanner.nextInt();
			System.out.print("Enter month of birthday: ");
			int month =scanner.nextInt();
			System.out.print("Enter day of birthday: ");
			int day =scanner.nextInt();
			Person d = new Person(firstname, lastname, year, month, day);
			printPersonElectionInfo(d, election);
		}
	}
	
	public static void printPersonElectionInfo(Person p, MyDate election) {
		p.printPersonInfo();
		System.out.println("Age: " + p.getAge(election));
		if(p.isEligible(election))
			System.out.println("This person is eligible to vote.");
		else
			System.out.println("This person is NOT eligible to vote");
		
		System.out.println("-----------------------------------");
	}
}
