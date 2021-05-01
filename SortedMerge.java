package for_CTCI;

public class SortedMerge {
	
	
	public static void merge(int[] A, int[] B) {
		// start at last element in A, last element in B
		int indexA = A.length - B.length - 1;
		int indexB = B.length - 1;
		int current = A.length - 1;
		while (indexA >= 0 && indexB >= 0) {
			if (A[indexA] >= B[indexB]) {
				A[current] = A[indexA];
				indexA--;
			} else {
				A[current] = B[indexB];
				indexB--;
			}
			current--;
		}

		while (indexB >= 0) {
			A[current] = B[indexB];
			indexB--;
			current--;
		}
	}
	
	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		int A[] = {2, 4, 6, x, x, x, x, x};
		int B[] = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
		System.out.println();
		merge(A, B);
		
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}
}
