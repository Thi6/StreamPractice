import java.util.ArrayList;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			numList.add(i);
			System.out.println(i);
		}

		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("brie");
		stringList.add("brie");
		stringList.add("camembert");
		stringList.add("halloumi");

		System.out.println(checkNum(numList, 5));
		System.out.println(checkNum(numList, 12));

		System.out.println(checkString(stringList, "cheddar"));
		System.out.println(checkString(stringList, "brie"));

		System.out.println(checkString2(stringList, "cheddar"));
		System.out.println(checkString2(stringList, "brie"));

		System.out.println(stringCount(stringList, "brie"));
		System.out.println(sumValues(numList));

		System.out.println(largestValue(numList));
		System.out.println(largestValue2(numList));

		System.out.println(removeOddNums(numList));
		System.out.println(sortList(numList));

		System.out.println(multipleBy10(numList));
	}

	public static boolean checkNum(ArrayList<Integer> numList, int checkValue) {
		return (boolean) numList.stream().anyMatch(i -> i == checkValue);
	}

	public static boolean checkString(ArrayList<String> stringList, String theString) {
		return (boolean) stringList.stream().anyMatch(s -> s.equals(theString));
	}

	public static ArrayList<String> checkString2(ArrayList<String> stringList, String theString) {
		return (ArrayList<String>) stringList.stream().filter(s -> s.equals(theString)).collect(Collectors.toList());
	}

// Create a method that checks for a specific word in a list of Strings and returns the number of times that word occurs.
	public static int stringCount(ArrayList<String> stringList, String theString) {
		return (int) stringList.stream().filter(s -> s.equals(theString)).count();
	}

	// Create a method that goes through a list of numbers and sums the values
	public static int sumValues(ArrayList<Integer> numList) {
		return (int) numList.stream().reduce(0, Integer::sum);
	}

	// Create a method that checks a list of numbers and returns the LARGEST value
	public static int largestValue(ArrayList<Integer> numList) {
		return (int) numList.stream().max(Integer::compare).get();
	}

	public static int largestValue2(ArrayList<Integer> numList) {
		return (int) numList.stream().reduce(0, Integer::max);
	}

	// Create a method that removes all ODD values from a list of Numbers.

	public static ArrayList<Integer> removeOddNums(ArrayList<Integer> numList) {
		return (ArrayList<Integer>) numList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	}
	/*
	 * Create a method that takes a list of Numbers and sort them into an
	 * incremental order
	 * 
	 * static - fixed, if you do something to one object then it will affect it
	 * everything else
	 */

	public static ArrayList<Integer> sortList(ArrayList<Integer> numList) {
		return (ArrayList<Integer>) numList.stream().sorted().collect(Collectors.toList());
	}

	// Create a method that multiples each number divisible by 5 by 10 in a list of
	// numbers
	public static ArrayList<Integer> multipleBy10(ArrayList<Integer> numList) {
		return (ArrayList<Integer>) numList.stream().filter(n -> n % 5 == 0).map(n -> n * 10)
				.collect(Collectors.toList());
	}

}
