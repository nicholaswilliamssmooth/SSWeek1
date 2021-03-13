package ops;
/*
 * Program that takes an input file and runs it through lambda functions
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class MainClass {
	
	// Constants
	final static Integer ARGS_PER_LINE = 2;
	
	/**
	 * 
	 * @param args arguments do nothing in this program
	 * @throws FileNotFoundException in case the file is missing
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// Declare and initialize variables
		ArrayList<Integer> numInput = new ArrayList<Integer>();
		Integer numbers = 0;
		Operations op = new Operations();
		File input = new File("./src/ops/input.txt");
		Scanner reader = new Scanner(input);
		
		// Read through the file and put values in an array list
		while (reader.hasNextInt()) {
			numInput.add(reader.nextInt());
		}
		reader.close();
		
		// first value dictates the number of values being read
		numbers = numInput.get(0);
		for (int i = 0; i < numbers; i++) {
			// offset of 1 for the first value since it just decides the number of iterations
			Integer index = ARGS_PER_LINE * i + 1;

			switch (numInput.get(index)) {
			case 1:
				System.out.println(op.convert(op.isOdd(), numInput.get(index+1)) ? "ODD" : "EVEN");
				break;
			case 2:
				System.out.println(op.convert(op.isPrime(), numInput.get(index+1)) ? "PRIME" : "COMPOSITE");
				break;
			case 3:
				System.out.println(op.convert(op.isPalindrome(), numInput.get(index+1)) ? "PALINDROME" : "SEMORDNILAP");
				break;
			}
			
		}


	}

}
