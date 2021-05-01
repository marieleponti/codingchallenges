import java.util.HashMap;
import java.util.Locale;

/* Design a method to find the frequency of occurrences of any given word in a book.
*  Design a method that can run this algorithm multiple times.
 */
public class WordFrequencies {

    public static HashMap<String, Integer> mapWords(String[] book){
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : book){
            word = word.toLowerCase();
            if (word.trim() != ""){
                if (!map.containsKey(word)){
                    map.put(word, 0);
                }
                map.put(word, map.get(word) + 1);
            }
        }
        return map;
    }

    public static int wordCount(String[] book, String word){
        HashMap<String, Integer> map = mapWords(book);
        if (book == null || word == null){ return -1; }
        word = word.toLowerCase();
        if (map.containsKey(word)){
            return map.get(word);
        }
        return 0;
    }

//    public static void main(String[] args){
//        String[] book = {"cabra", "q", "cabra", " p", "p"};
//        String[] book1 = {"cabra", "q", "cabra", " p", "p", "te", " cafe", " te"};
//        System.out.println(wordCount(book, "cabra"));
//        System.out.println(wordCount(book1, "q"));
//    }
}
