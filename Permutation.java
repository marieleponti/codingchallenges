import java.util.HashMap;

/** Given two strings, determine if one is
 * premutation of the other.
 */
public class Permutation {

    public static boolean permutation(String a, String b){
        if (a.length() != b.length()){return false;}
        int[] alphabet = new int[128];
        char[] char_array = a.toCharArray();
        for (char c : char_array){
            // ascii value
            alphabet[(int)c]++;
        }
        for (int i = 0; i < b.length(); i++){
            int ascii = b.charAt(i);
            alphabet[ascii]--;
            if (alphabet[ascii] < 0){
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args){
//        System.out.println("empty strings: " + permutation("", ""));
//        System.out.println("empty string, x: " + permutation("", "x"));
//        System.out.println("llama, amal: " + permutation("llama", "amal"));
//        System.out.println("llama, amall: " + permutation("llama", "amall"));
//        System.out.println("llama, amalx: " + permutation("llama", "amalx"));
//    }
}
