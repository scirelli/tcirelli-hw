
public class Unit8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Assignment Unit 8 \n\n");
		
		
		int[] numberArray = {56, 77, 23, 12, 88, 59, 97, 33, 38, 64};
		int   maxIndex = findMax(numberArray, numberArray.length);
		System.out.println("The largest number in the array is "+ numberArray[maxIndex] 
						+ " located at array index " + maxIndex + "\n\n");
		
		
		String[] stringArray = new String[10];
		evenOrOdd(numberArray,stringArray, numberArray.length);
		System.out.println("The numbers were:");
		for (int i = 0; i < numberArray.length; i++)
		System.out.println(numberArray[i] + " is " + stringArray[i]);
	}
		
	public static int findMax(int[] Array, int length) 
	{
		int max = Array[0];
		int index = 0;
		for(int i = 0; i < length; i++) 
		{
			if (Array[i] > max) 
			{
				max = Array[i];
				index = i;
			}
			
		}
		return index;
	}
	
	public static void evenOrOdd (int[] Array, String[] strArray , int length)
	{
		for (int i=0; i < length; i++)
		{
			if(Array[i]%2 == 0)
			{
				strArray[i] = "even";
			}
			else
			{
				strArray[i] = "odd";
			}
		}
	}
}


