package for_CTCI;

/** String Compression 1.6 in CTCI
 * eg: 	input: aabbcaaa 
 * 		output: a2b2c1a3 
 * **/

public class StringCompression {
	
	public static void main(String[] args) {
		String str0 = "aabbbcda"; //a2b3c1d1a1
		String str1 = "ppppqqpppfft";
		System.out.println(compress(str0));
		System.out.println(compress(str1));
	}
	
	public static String compress(String str) {
		// get length of compressed str
		int compLen = getCompressedLen(str);
		if (compLen >= str.length()) return str;
		
		int cnt = 0;
		StringBuilder sb = new StringBuilder(compLen);
		for (int i = 0; i < str.length(); i++) {
			cnt++;
			if (i + 1 >= str.length() || str.charAt(i + 1) != str.charAt(i)) {
				sb.append(str.charAt(i));
				sb.append(String.valueOf(cnt));
				cnt = 0;
			}
		}
		
		return sb.toString();
	}
	
	public static int getCompressedLen(String str) {
		int len = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count ++;
			if (i + 1 >= str.length() || str.charAt(i + 1) != str.charAt(i)) {
				len += 1 + String.valueOf(count).length(); 
				count = 0;
			}
		}
		return len;
	}
}
