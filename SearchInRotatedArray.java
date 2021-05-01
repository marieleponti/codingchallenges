package for_CTCI;

public class SearchInRotatedArray {
		
		public static void main(String[] args) {
			int [] myArray = {15, 16, 20, 25, 1, 3, 5, 7, 4};
			int [] myArray1 = {3, 5, 7, 4, 15, 16, 20, 25, 1};
			int [] myArray2 = {7, 4, 15, 16, 20, 25, 1, 3, 5};
			int index0 = findIndex(myArray, 25, 0, myArray.length - 1);
	    int index = findIndex(myArray, 1, 0, myArray.length - 1);
			int index1 = findIndex(myArray1, 25, 0, myArray1.length - 1);
			int index2 = findIndex(myArray2, 25, 0, myArray2.length - 1);
			int index3 = findIndex(myArray1, 1, 0, myArray1.length - 1);
			
	    System.out.println(index0);
			System.out.println(index);
			System.out.println(index1);
			System.out.println(index2);
			System.out.println(index3);
		}
		
		public static int findIndex(int[] arr, int x, int start, int end) {
			int mid = (start + end)/2;
	    System.out.println("x: " + x + "; mid: " + mid + ", arr[mid]: " + arr[mid]);
			if(arr[mid] == x) return mid;
	    
			// if (arr[start] == x) return start;
			// if(arr[end] == x) return end;
			
	    if (end < start){
	      return -1;
	    }
				if (arr[mid] < arr[start]) {
					// inflection point is to the left of mid
	        // right half normal order
					if (x > arr[mid] && x <= arr[end]) {
						return findIndex(arr, x, mid + 1, end);
					} else {
						return findIndex(arr, x, start, mid - 1);
					}
					
				} else if (arr[mid] > start) {
					// inflection point is to the right of mid
	        // left half normal order
					if (x >= arr[start] && x < arr[mid]) {
						return findIndex(arr, x, start, mid - 1);
					} else {
						return findIndex(arr, x, mid + 1, end);
					}
				} else if (arr[start] == arr[mid]){
	        if (arr[mid] != arr[end]){
	          return findIndex(arr, x, mid + 1, end);
	        } else {
	          int result =  findIndex(arr, x, start, mid - 1);
	          if (result == -1){
	            return findIndex(arr, x, mid + 1, end);
	          }
	        }
	      }
			return -1; // error
		}

	}

