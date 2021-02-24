package StringCalculator;

import java.util.ArrayList;

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
		String pattern = "[,\n]";
		String str_numbers[] = input.split(pattern);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(String num : str_numbers) {
			numbers.add(stoi(num));
		}
		return numbers;
	}
}
