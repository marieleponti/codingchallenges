package for_CTCI;
import java.util.LinkedList;

/** Given any integer, print English phrase to describe the integer
 * **/
public class EnglishInt {
	
	static String[] under20 = {"zero", "one", "two", "three", "four", "five", "six", "seven", 
			"eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", 
			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety"};
	static String hundred = "hundred";
	static String[] thousands = {"", "thousand", "million", "billion"};
	
	public static String intToString(int num) {
		if (num < 0) return "negative " + intToString(-1 * num);
		if (num < 20) return under20[num];

		LinkedList<String> parts = new LinkedList<String>();
		int count = 0;
		
		while (num > 0) {
			if (num % 1000 != 0) {
				parts.addFirst(convertSec(num % 1000) + " " + thousands[count]);
			} 
			num /= 1000;
			count++;
		}
		
		return toString(parts);
	}
	
	public static String convertSec(int num) {
		LinkedList<String> parts = new LinkedList<String>();
		if (num >= 100) { //100-999
			parts.add(under20[num / 100]);
			parts.add(hundred);
			if (num % 100 != 0) {
				parts.add(convertSec(num % 100));
			}
		} else if (num >= 20) { // 20-99
			parts.add(tens[num / 10]);
			if(num % 10 != 0) {
				parts.add(under20[num % 10]);
			}
		} else {
			parts.add(under20[num]);
		}
		return toString(parts);
	}
	
	public static String toString(LinkedList<String> parts) {
		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < parts.size(); i++) {
//			sb.append(parts.get(i));
//			sb.append(" ");
//		}
		while (parts.size() > 1) {
			sb.append(parts.pop());
			sb.append(" ");
		}
		sb.append(parts.pop());
		return sb.toString();
	}
	
	public static void main(String[] args) {
		int num0 = 980230100; // 980,234,111
		int num1 = 0;
		int num2 = -700450301; // -700,450,301
		int num4 = 10000; //10,000
		int num3 = 91400; //91,400
		System.out.println(num0 + "->" + intToString(num0));
		System.out.println(num1 + "->" + intToString(num1));
		System.out.println(num2 + "->" + intToString(num2));
		System.out.println(num3 + "->" + intToString(num3));
		System.out.println(num4 + "->" + intToString(num4));
	}
}
