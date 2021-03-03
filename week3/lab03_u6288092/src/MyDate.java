public class MyDate 
{
	private int year,month,day,objectNumber;
	public static int yearDiff(MyDate start, MyDate end)
	{
		if(end.year>=start.year && end.month>=start.month && end.day>start.day)
		{
			return (end.year - start.year)-1;
		}
		else if(end.year>=start.year && end.month<=start.month && end.day>=start.day)
		{
			return end.year - start.year;
		}
		else if(end.year>=start.year && end.month<=start.month && end.day<=start.day)
		{
			return end.year - start.year;
		}
		else
		{
			return -1;	
		}
		
	}
	public static int objectCounter;
	public static String[] strMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	MyDate()
	{
		this.year = 1900;
		this.month = 1;
		this.day = 1;
		objectCounter++;
		objectNumber = objectCounter;
	}
	MyDate(int aYear, int aMonth, int aDay)
	{
		this.year = aYear;
		this.month = aMonth;
		this.day = aDay;
		 objectCounter++;
		 objectNumber = objectCounter;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int aYear) {
		this.year = aYear;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int aMonth) {
		this.month = aMonth;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int aDay) {
		this.day = aDay;
	}
	public int getObjectNumber() {
		return objectNumber;
	}
	public static String[] getStrMonths() {
		return strMonths;
	}
	public static void setStrMonths(String[] strMonths) {
		MyDate.strMonths = strMonths;
	}
	void setDate (int aYear,int aMonth, int aDay) {
		this.year = aYear;
		this.month = aMonth;
		this.day = aDay;
	}
	public String toString() {
		return this.day + " " + this.strMonths[this.month - 1] + " " + this.year;
	}
	public MyDate nextDay()
	{
		if(this.month == 12 && this.day == 31)
		{
			this.year++;
		    this.month = 1;
		    this.day = 1;
		}
		else
		{
			if(this.month == 4 || this.month == 6 || this.month ==9 || this.month == 11)
			{
				if(this.day == 30) 
				{
					this.month++;
			    	this.day = 1;
			    }
				else
				{
					 this.day++;
				}
			}
			else if(month != 2) 
			{
		        if(day == 31) 
		        {
		        	this.month++;
		        	this.day = 1;
		        }
		        else
		        {
		        	this.day++;
		        }
			}
		    else
		    {
		    	if(isLeapYear(this.year) && this.day == 29) 
		    	{
		    		this.month++;
			    	this.day = 1;
			    }
			    else if(!isLeapYear(this.year) && this.day == 28) 
			    {
			        this.month++;
			        this.day = 1;
			    }
			    else 
			    {
			        this.day++;
			    }
		    }
		}
		return this;
		
	}
	public MyDate nextMonth()
	{
		if(this.month == 12 ) 
		{
		      this.year++;
		      this.month = 1;
		    }
		    {
		      if(this.day == 30 &&(this.month == 4 || this.month == 6 || this.month ==9 || this.month == 11)) 
		      {
		        this.day = 30;
		        this.month++;
		  
		        }
		        
		      }
		      if(month == 1) 
		      {
		        if(day >= 29 && isLeapYear(year)==true) 
		        {
		          this.month++;
		          this.day = 29;
		        }
		        else if(day >=28 && isLeapYear(year)==false) 
		        {
		          this.day=28;
		          this.month++;
		        }
		      }
		      else 
		      {
		        this.month++;
		      }
		    
		    return this;
		
	}
	public MyDate nextYear()
	{
		if(!isLeapYear(this.year + 1) && (this.month == 2 && this.day == 29)) 
		{
		      this.day = 28;
		    }
		    this.year++;
		    return this;
		  
	}
	public MyDate previousDay()
	{
		if(this.month == 1 && this.day == 1) 
		{
			this.year--;
		    this.month = 12;
		    this.day = 31;
		}
		else 
		{
		    if(this.month == 5 || this.month == 7 || this.month == 10 || this.month == 12) 
		    {
		    	if(this.day == 1) 
		    	{
		    		this.month--;
		    		this.day = 30;
		        }
		        else 
		        {
		          this.day--;
		        }
		    }
		    else if(this.month != 3) 
		    {
		    	if(day == 1) 
		        {
		          this.month--;
		          this.day = 31;
		        }
		        else 
		        {
		          this.day--;
		        }
		   }
		   else 
		   {
			   if(isLeapYear(this.year) && day == 1) 
		       {
		         this.month--;
		         this.day = 29;
		       }
		       else if(day == 1) 
		       {
		         this.month--;
		         this.day = 28;
		       }
		       else 
		       {
		         this.day--;
		       }
		  }
	}
		    return this;
		
	}
	public MyDate previousMonth()
	{
		if(this.month == 1) 
		{
		      this.year--;
		      this.month = 12;
		    }
		    else {
		      this.month--;
		    }
		    if(this.day == 31 && (this.month == 4 || this.month == 6 || this.month ==9 || this.month == 11)) 
		    {
		      this.day = 30;
		    }
		    return this;
		  
		
	}
	public MyDate previousYear()
	{
		if(!isLeapYear(this.year - 1) && (this.month == 2 && this.day == 29)) 
		{
		      this.day = 28;
		    }
		    this.year--;
		    return this;
		
	}
	public static boolean isLeapYear(int year)
	{
		if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) 
		{
		      return true;
		}
		else 
		{
		      return false;
		}
	}
}
