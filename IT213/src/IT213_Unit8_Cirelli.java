
public class IT213_Unit8_Cirelli {

	public static void main(String[] args) {
		System.out.println("Assignment Unit 8 \n\n");
		
		
		int[] numberArray = {56, 77, 23, 12, 88, 59, 97, 33, 38, 64};
		
		
		int   maxIndex = findMax(numberArray);
		System.out.println("The largest number in the array is "+ numberArray[maxIndex] 
						+ " located at array index " + maxIndex + "\n\n");
		
		
		String[] stringArray = evenOrOdd(numberArray);
		System.out.println("The numbers were:");
		for (int i = 0; i < numberArray.length; i++)
			System.out.println(numberArray[i] + " is " + stringArray[i]);
	}
		
	public static int findMax(int[] Array) 
	{
		int max = Array[0];
		int index = 0;
		for(int i = 0; i < Array.length; i++) 
		{
			if (Array[i] > max) 
			{
				max = Array[i];
				index = i;
			}
			
		}
		return index;
	}
	
	public static String[] evenOrOdd (int[] Array)
	{
		String output[] = new String[Array.length];
		for (int i=0; i < Array.length; i++)
		{
			if(Array[i]%2 == 0)
			{
				output[i] = "even";
			}
			else
			{
				output[i] = "odd";
			}
		}
		return output;
	}
}
	

