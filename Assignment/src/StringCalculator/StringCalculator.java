package StringCalculator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public static int addMethodCallCount = 0;
	public static int GetCalledCount() {
		return addMethodCallCount;
	}
	public static int add(String input) {
		addMethodCallCount += 1;
		if(input.isEmpty()) {
			return 0;
		}
		else {
			int sum = 0;
			ArrayList<Integer> numbers = getNumbers(input);
			ArrayList<Integer> negatives = new ArrayList<Integer>();
			for(Integer a : numbers) if(a < 0) negatives.add(a);
			if(negatives.size()>0) 
			{
				String res = "Negatives are not allowed " + join(negatives);
				System.out.println(res);
				throw new RuntimeException(res);
			}
			for(Integer num : numbers)
				if(num <= 1000)
				sum += num;
		return sum;
		}
	}
	private static String join(ArrayList<Integer> negatives) {
		StringBuilder res = new StringBuilder();
		int size = negatives.size();
		for(int i=0;i<size-1;i++) 
			res.append(negatives.get(i) + " ");
		res.append(negatives.get(size-1));
		return res.toString();
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
