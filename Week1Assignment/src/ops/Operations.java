package ops;

public class Operations {
	
	/**
	 * Checks to see if the value is odd or even
	 * @return true if odd, false if even
	 */
	public PerformOperation isOdd() {
		return num -> (num % 2 != 0);
	}
	
	/**
	 * loops to see if value is prime
	 * @return true if prime, false if composite
	 */
	public PerformOperation isPrime() {
		return num -> {
			int flag = 0;
			for (int i = 2; i <= num / 2; i++) {
				// Not Prime, found a divisible number
				if (num % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				return true;
			else
				return false;
		};
	}
	
	/**
	 * loops to see if value is a palindrome
	 * @return true if palindrome, false if not
	 */
	public PerformOperation isPalindrome() {
		return num -> {
			// Use string builder for the reverse method
			StringBuilder str = new StringBuilder(String.valueOf(num));
			StringBuilder reverseStr = new StringBuilder(str.reverse());
			str.reverse(); // reverse edits the original number so we need to reverse it again
			return str.toString().equals(reverseStr.toString());
		};
	}
	
	/**
	 * Converts from the lambda function to the actual boolean value
	 * @param perf the returned lambda functions above
	 * @param num the number we want to input to judge
	 * @return returns the converted boolean value 
	 */
	public boolean convert(PerformOperation perf, Integer num) {
		return perf.func(num);
	}
}
