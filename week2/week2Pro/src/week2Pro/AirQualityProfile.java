package week2Pro;
//import java.time.LocalDateTime;
public class AirQualityProfile 
{
	//private LocalDateTime dtt = LocalDateTime.now();
	private String datetime = "2020-01-18 18:00";	
	private String location = "Thon Buri";
	private int aqi = 112;
	private int pm25 = 40;
	private double temp = 29.0;
	public static int count=0;
	
	public AirQualityProfile(String dt, String loc, int aqi, int pm25, double temp)
	{
		this.datetime=dt;
		this.location=loc;
		this.aqi=aqi;
		this.pm25=pm25;
		this.temp=temp;
		count++;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAqi() {
		return aqi;
	}

	public void setAqi(int aqi) {
		this.aqi = aqi;
	}

	public int getPm25() {
		return pm25;
	}

	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	public void printAirQualityInfo()
	{
		
		System.out.println(getLocation()+ " at " +getDatetime());
		System.out.println("AQI: "+ getAqi() +" PM2.5: "+ getPm25() +" microgram/m3");
		System.out.println("Temperature: "+ getTemp() +" Celcius");
		System.out.println(isUnhealthy());
		System.out.println(isCold());
	} 
	public boolean isUnhealthy()
	{
		if(aqi > 100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String isCold()
	{
		if(temp<25)
		{
			return "cold";
		}
		else
		{
			return "hot";
		}
	}
}

