package StringCalculator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public static int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		else {
			int sum = 0;
			ArrayList<Integer> numbers = getNumbers(input);
			for(Integer num : numbers)
				sum += num;
			return sum;
		}
	}
	private static int stoi(String input) {
		return Integer.parseInt(input);
	}
	private static ArrayList<Integer> getNumbers(String input) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String str_numbers[];
		if(input.startsWith("//")) {
			Matcher match = Pattern.compile("//(.)\n(.*)").matcher(input);
			match.matches();
			String newDelimiter = match.group(1);
			str_numbers = match.group(2).split(newDelimiter);
		}
		else {
			String pattern = "[,\n]";
			str_numbers = input.split(pattern);
		}
		for(String num : str_numbers) 
			numbers.add(stoi(num));
		return numbers;
	}
}
