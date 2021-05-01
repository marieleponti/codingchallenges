package for_CTCI;

import java.util.Arrays;

class PeaksValleys {  
	public static void main (String[] args) {
		int[] myArray = {9, 8, 7, 0, 1, 1, 6, 2};
	    for (int i = 0; i < myArray.length; i++){
	      System.out.print(myArray[i] + " ");
	    }
	    System.out.println();
	    myArray = peaksAndValleys(myArray);
	    for (int i = 0; i < myArray.length; i++){
	      System.out.print(myArray[i] + " ");
	    }
	}
  
  public static int[] peaksAndValleys(int[] array){
    Arrays.sort(array);
    int[] result = new int[array.length];
    int j = 0;
    for (int i = 0; i < array.length; i+=2){
        result[i] = array[array.length - 1 - j];
        result[i+1] = array[j];
        j++;
    }
      return result;
  }
}
