import java.text.NumberFormat;
import java.util.Locale;

public class IT213_unit1_Cirelli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// question 1
		String name = "John Smith";

		String address = "101 N. Main Street";

		String city = "AnyTown";

		String state = "TX";

		String zipCode = "11111";

		String unitsTaken = "19";
		
		// question 2
		final double pricePerUnit = 100.50;
		
		// question 3
		final double discount = 150;
		
		//question 4
		int intunitsTaken = Integer.parseInt(unitsTaken);
		
		//question 5
		intunitsTaken++;
		
		//question 6
		double tuition = pricePerUnit * intunitsTaken;
		
		//question 7
		double afterDiscount = tuition - discount;
		
		//question 8
		double monthlyPayment = afterDiscount / 12;
		
		//display output
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address);
		System.out.println("City: "+ city);
		System.out.println("State: "+ state);
		System.out.println("Zip Code: "+ zipCode);
		
		System.out.println("The number of unit taken is: "+ intunitsTaken);
		
		System.out.println("The tuition before discount is: "+ NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(tuition));
		System.out.println("The tuition after twenty-unit discount is: "+ NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(afterDiscount));
		System.out.println("Your monthly payment is: "+ NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(monthlyPayment));
	}

}






