package StringCalculator;

public class StringCalculator {
	public static int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		else {
			String numbers[] = input.split(",");
//			if(numbers.length == 1) return stoi(numbers[0]);
//			else return stoi(numbers[0]) + stoi(numbers[1]);
			
			int sum = 0;
			for(String num : numbers) {
				sum += stoi(num);
			}
			return sum ;
		}
	}
	private static int stoi(String input) {
		return Integer.parseInt(input);
	}
}
