import java.lang.Math;

public class IT213_Unit7_Cirelli {

	public static void main(String[] args) {
		float tempC[] = {35.5f, 30.5f, 22.2f, 16.1f, 7.3f, -1f};
		
		System.out.print("Assignment 7 \n\n");
		for (int i=0; i<tempC.length; i++) {
			System.out.println(String.format("The temperature is %.1fC or %dF. %s",
					tempC[i],
					celsiusToFahrenheit(tempC[i]),
					weatherStatement(celsiusToFahrenheit(tempC[i]))
			));
		}
	}
	
	private static int celsiusToFahrenheit(float c) {
		return Math.round(c * (9f/5f) + 32f);
	}
	
	private static String weatherStatement(int f) {
		if( f >= 95            ) return "A heat advisory has been issued.";
		if( 85 <= f && f <= 94 ) return "Pleasant but warm.";
		if( 70 <= f && f <= 84 ) return "Very pleasant weather today.";
		if( 50 <= f && f <= 69 ) return "Pleasant but cool.";
		if( 33 <= f && f <= 49 ) return "Cold weather.";
		if( f <= 32            ) return "A freeze warning has been issued.";
		return "";
	}
}
