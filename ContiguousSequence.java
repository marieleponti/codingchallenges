/** Find the contiguous sequence with the largest sum given
 * an array of integers. Return the sum.
 * eg
 * input 2, -8, 3, -2, 4, -10
 * output 5 (i.e. {3, -2, 4})**/

public class ContiguousSequence {

/** array =   2, -8, 3, -2, 4, -10, 1, 1, 1, 1, 1, 1
 *  sorted = 4, 3, 2, 1, 1, 1, 1, 1, 1, -2, -8, -10
 *  sorted[0] = 4 = array[4]-> sorted[1] = 3 = array[2]
 *                          -> array[3] = -2
 *                          -> array[2] + array[3] >= 0
 *                          sumale: 5
 *
 * **/

    public static int maxSumOfSeq(int[] array){
        if (array.length == 0) return -1; // error value;
        if (array.length == 1) return array[0];
        int curSum = array[0];;
        int maxSum = array[0];
        for (int i = 0; i < array.length; i++){
            if (curSum + array[i] > maxSum){
                maxSum = curSum + array[i];
            }
            if (curSum + array[i] < array[i]){
                curSum = array[i];
            } else {
                curSum += array[i];
            }
            if (curSum > maxSum){
                maxSum = curSum;
            }
        }
        return maxSum;
    }

//    public static void main(String[] args){
//        int[] myArr = {2, -8, 3, -2, 4, -10, 1, 1, 1, 1, 1, 1};
//        int[] myArr1 = {Integer.MIN_VALUE};
//        int[] myArr2 = {2, -8, -3, -2, 4, 10, -9, 9, 0, 2, -2, 8};
//        System.out.println(maxSumOfSeq(myArr));
//        System.out.println(maxSumOfSeq(myArr1));
//        System.out.println(maxSumOfSeq(myArr2));
//    }
}
