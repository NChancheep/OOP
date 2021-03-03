// Name:Chancheep Mahacharoensuk
// ID:u6288092
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word or phrase to check if it is a palindrome: ");
		String input = scanner.nextLine();
		String reInput = "";
		String secInput = "";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)>=65 && input.charAt(i)<=90 || input.charAt(i)>=97 && input.charAt(i)<=122)
			{
				secInput += input.charAt(i);
				//System.out.println(secInput);
			}
			else
			{
				continue;
			}
		}
		for(int i=input.length()-1;i>=0;i--)
		{
			if(input.charAt(i)>=65 && input.charAt(i)<=90 || input.charAt(i)>=97 && input.charAt(i)<=122)
			{
				reInput += input.charAt(i);
				//System.out.println(reInput);
			}
			else
			{
				continue;
			}
		}
		int check =0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==32)
			{
				check=1;
				break;
			}
			else
			{
				continue;
			}
		}
		if(check==1)
		{
			if(secInput.equalsIgnoreCase(reInput)) 
			{
			        System.out.println("The input phrase \""+ input +"\" is a palindrome.");
				}
			    else 
			    {
			    	System.out.println("The input phrase \""+ input +"\" is not a palindrome.");
			    }
		}
		else
		{
			if(secInput.equalsIgnoreCase(reInput)) 
			{
			        System.out.println("The input word \""+ input +"\" is a palindrome.");
				}
			    else 
			    {
			    	System.out.println("The input word \""+ input +"\" is not a palindrome.");
			    }
		}
	}
}
