import java.util.Arrays;
import java.util.StringTokenizer;

public class IT213_Cirelli_Unit5_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "The quick brown fox jumps over the lazy dog";
		int wordsCount = 0;
		for (int i=0; i<sentence.length(); i++) {
			if (sentence.substring(i).startsWith(" ")||i==0) {
				for(int k=i+1; k<=sentence.length()-1; k++) {
					if (sentence.substring(k).startsWith(" ")||k == sentence.length()-1) {
						wordsCount++;
						System.out.println(wordsCount+sentence.substring(i,k));
						i=k;
					}
				}
			}
		}
		
				System.out.println("Total word count is = "+ wordsCount + " words");
	}

}
