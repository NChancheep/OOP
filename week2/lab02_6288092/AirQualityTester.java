package week2Pro;

public class AirQualityTester 
{
	public static void main(String[] args) 
	{
		AirQualityProfile NPM1 = new AirQualityProfile("2020-01-18 18:00", "Thon Buri", 112, 40, 29.0);
		AirQualityProfile NPM2 = new AirQualityProfile("2020-01-22 18:00", "Bangkok", 152, 58, 31.0);
		//NPM.printAirQualityInfo();
		//NPM.setLocation("Bangkok");
		//NPM.setDatetime("2020-01-22 18:00");
		//NPM.setPm25(58);
		//NPM.setAqi(152);
		//NPM.setTemp(31.0);
		NPM1.printAirQualityInfo();
		NPM2.printAirQualityInfo();
	}
}
