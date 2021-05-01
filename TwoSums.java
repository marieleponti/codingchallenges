package for_CTCI;
import java.util.*;

public class TwoSums {

	public static int[] twoSums(int[] array, int target) {
		int[] arr = {-1, -1}; 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(target - array[i])) {
				map.put(array[i], i);
			} else {
				arr[0] = map.get(target - array[i]);
				arr[1] = i;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] myArray = {0, 2, 3, 4, 8, 22, 25};
		int myTarget = 24;
		int[] result = twoSums(myArray, myTarget);
		for (int i = 0; i < 2; i++) {
			System.out.println(result[i]);
		}
	}
}
