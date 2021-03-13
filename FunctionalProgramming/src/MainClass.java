import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Program manipulates data with lambda expressions as a fun exercise
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {
	
	
	/**
	 * method helps us to decide if our objects strings are 
	 * @param str1 compares with second string
	 * @param str2 compares with first string
	 * @return
	 */
	public int helperMethod(String str1, String str2) {
		if (str1.charAt(0) == 'E') {
			return str1.charAt(0) - str2.charAt(0);
		}
		else if (str2.charAt(0) == 'E') {
			return str1.charAt(0) - str2.charAt(0);
		}
		else {
			return str2.charAt(0) - str1.charAt(0);
		}		
	}
	/**
	 * formats an array of integers to specify if they are odd or even, and seperates them by commas
	 * @param intArray user entered Array of integers to be formatted
	 * @return the formatted string
	 */
	public StringBuffer intCommas(List<Integer> intArray) {
		final StringBuffer str = new StringBuffer();

		// Lambda
		intArray.forEach((num) -> {
			if (num % 2 == 0) {
				str.append("e" + num + ",");
			}
			else {
				str.append("o" + num + ",");
			}
		});
		// Removes last comma, a bit of a hack
		str.deleteCharAt(str.length()-1);
		return str;
	}
	/**
	 * Filters through strings, returns only strings that start with 'a'
	 * and are 3 characters long
	 * @param strs Takes a list of Strings to filter through
	 * @return Filtered array
	 */
	public List<String> stringTest(List<String> strs) {
		
		return strs.stream().filter(s -> 
		s.charAt(0) == 'a' && s.length() == 3)
				.collect(Collectors.toList());

		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare and initialize variables
		List<String> strs = Arrays.asList("Discovery", "Random Access Memories", "Alive", "Homework", "Euham After All");
		MainClass mnObj = new MainClass(); // Used for the method call, int formatting, and string filtering

		System.out.println("Sorting Titles:");
		// Shortest to longest
		System.out.println("\tShortest to longest titles:");
		strs.sort((str1, str2) -> str1.length() - str2.length());
		strs.forEach(titles -> System.out.print("\t\t" + titles + "\n"));
		System.out.print("\n");
		// Longest to shortest
		System.out.println("\tLongest to shortest titles:");
		strs.sort((str1, str2) -> str2.length() - str1.length());
		strs.forEach(titles -> System.out.print("\t\t" + titles + "\n"));
		System.out.print("\n");
		// Alphabetical
		System.out.println("\tAlphabetical titles:");
		strs.sort((str1, str2) -> str1.charAt(0) - str2.charAt(0));
		strs.forEach(titles -> System.out.print("\t\t" + titles + "\n"));
		System.out.print("\n");
		// Reverse alphabetical
		System.out.println("\tReverse alphabetical titles:");
		strs.sort((str1, str2) -> str2.charAt(0) - str1.charAt(0));
		strs.forEach(titles -> System.out.print("\t\t" + titles + "\n"));
		System.out.print("\n");	
		// Strings starting with E are at the front of the list
		System.out.println("\tStrings starting with 'e' are first:");
		strs.sort((str1, str2) -> {
			if (str1.charAt(0) == 'E') {
				return str1.charAt(0) - str2.charAt(0);
			}
			else if (str2.charAt(0) == 'E') {
				return str1.charAt(0) - str2.charAt(0);
			}
			else {
				return str2.charAt(0) - str1.charAt(0);
			}
		});
		strs.forEach(titles -> System.out.print("\t\t" + titles + "\n"));
		System.out.print("\n");	
		// Same operation at above, but this time with the helper method.
		System.out.println("\tSame as above, but now in a method:");
		strs.sort((str1, str2) -> mnObj.helperMethod(str1, str2));
		strs.forEach(titles -> System.out.print("\t\t" + titles + "\n"));
		
		// Integer Commas formatting
		System.out.println("\nInteger Commas:");
		System.out.print("\t" + mnObj.intCommas(Arrays.asList(1, 2, 3, 4, 0, 23, 58, 22)));
		
		// Filtering strings, only return 3 character long strings starting with 'a'
		System.out.println("\n\nFiltering Strings:");
		mnObj.stringTest(
			Arrays.asList("ace", "eaa", "eaaaa", "aee", "ate"))
			.forEach(passingStr -> System.out.println("\t" + passingStr));



	}

}
