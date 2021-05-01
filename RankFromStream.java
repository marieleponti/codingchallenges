package for_CTCI;/* Rank From Stream: CTCI 10.10 */
public class RankFromStream {
    public static void main(String[] args) {
        Track helper = new Track();
        int[] array = { 5, 1, 4, 4, 5, 9, 7, 13, 3};
       // int[] array = {5};
        for (int i = 0; i < array.length; i++){
            helper.track(array[i]);
        }
        System.out.println(helper.root.getRank(1));
        System.out.println(helper.root.getRank(3));
        System.out.println(helper.root.getRank(4));
        System.out.println(helper.root.getRank(3));
        //System.out.println(helper.root.getRank(13));
        System.out.println(helper.root.getRank(100));
        System.out.println(helper.root.getRank(99));
    }
}
