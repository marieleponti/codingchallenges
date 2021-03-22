public class NumberSwap {
    public static void swapInts(int[] pair){
        int a = pair[0];
        int b = pair[1];
        a = b - a;
        b = b - a;
        a = b + a;
        pair[0] = a;
        pair[1] = b;
    }

    public static void main(String[] args){
        System.out.println("hello world!");
        int[] myPair = {4, 14};
        System.out.println("x: " + myPair[0] + ", y: " + myPair[1]);
        swapInts(myPair);
        System.out.println("x: " + myPair[0] + ", y: " + myPair[1]);
        Set mySet = new Set(9, 19);
        System.out.println("x: " + mySet.x + ", y: " + mySet.y);
        mySet.swap();
        System.out.println("x: " + mySet.x + ", y: " + mySet.y);
        Set mySet1 = new Set(13, 27);
        System.out.println("x: " + mySet1.x + ", y: " + mySet1.y);
        mySet1.swapBits();
        System.out.println("x: " + mySet1.x + ", y: " + mySet1.y);
    }
}
