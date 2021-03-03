import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word or phrase to check if it is a palindrome:");
		String w = input.nextLine();
		w=w.toLowerCase();
		int i=0;
		int j=w.length()-1;
		int check=0;
		while (j>i)
		{
			if (w.charAt(i++)!=w.charAt(j--))
			{
				System.out.println("The input word "+'"'+w+'"'+" is not a palindome");
				check =1;
				break;
			}
			
		}
			if(check!=1)
				System.out.println("The input word "+'"'+w+'"'+" is a palindome");	
	}
}
