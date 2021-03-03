public class Person 
{
	public String firstname;
	public String lastname;
	public MyDate birthday;
	public int age;
	Person(String aFirstname, String aLastname)
	{
		this.firstname = aFirstname;
		this.lastname = aLastname;
		birthday = new MyDate();
	}
	Person(String aFirstname, String aLastname, int aYear, int aMonth,int aDay)
	{
		this.firstname = aFirstname;
		this.lastname = aLastname;
		birthday = new MyDate();
		this.birthday.year = aYear;
		this.birthday.month = aMonth;
		this.birthday.day = aDay;
	}
	public int getAge(MyDate aDate)
	{
		age=birthday.yearDiff(birthday, aDate);
		return age;
	}
	public boolean isEligible(MyDate elecDate)
	{
		age=birthday.yearDiff(birthday, elecDate);
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void printPersonInfo()
	{
		System.out.println("Person: "+this.firstname+" "+this.lastname);
		System.out.println("Birthday: "+this.birthday.day+" "+MyDate.strMonths[this.birthday.month-1]+" "+this.birthday.year);
	}
	
}
