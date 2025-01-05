// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int i = Integer.parseInt(args[0]);
		int hundreds = i/100;
		int tens = i%100;
		tens = tens/10 ; 
		int ones = i % 10;
		System.out.println(hundreds + " hundreds, " + tens + " tens, " + "and " +ones+ " ones.");
	}
}
