
package week2Pro;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AirQualityTester 
{
	public static void main(String[] args) 
	{
		LocalDateTime localDT = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		
		AirQualityProfile NPM1 = new AirQualityProfile(localDT.format(formatter), "Thon Buri", 112, 40, 29.0);
		AirQualityProfile NPM2 = new AirQualityProfile(localDT.format(formatter), "Bangkok", 152, 58, 31.0);
		//NPM.printAirQualityInfo();
		//NPM.setLocation("Bangkok");
		//NPM.setDatetime("2020-01-22 18:00");
		//NPM.setPm25(58);
		//NPM.setAqi(152);
		//NPM.setTemp(31.0);
		NPM1.printAirQualityInfo();
		NPM2.printAirQualityInfo();
		System.out.println(AirQualityProfile.count);
	}
}
