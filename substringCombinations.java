import java.util.Arrays;

public class substringCombinations {
    /** number of non-empty substrings in string s st
     * a + b != b + c += c + a
     */
    public static int substringDivs(String s){
        int count = 0;
        char[] a;
        char[] b;
        char[] c;
        char[] chArr = s.toCharArray();
        for (int i = 0; i < s.length() - 2; i++){
            for (int j = i + 1; j < s.length() - 1; j++){
                a = Arrays.copyOfRange(chArr, 0, i + 1);
                b = Arrays.copyOfRange(chArr, i + 1, j + 1);
                c = Arrays.copyOfRange(chArr, j + 1, s.length());
                String aStr = Arrays.toString(a);
                String bStr = Arrays.toString(b);
                String cStr = Arrays.toString(c);
                System.out.print("a: " + aStr + " ");
                System.out.print("b: " + bStr + " ");
                System.out.print("c: " + cStr + "\n");
                System.out.println("ab: " + aStr + bStr);
                System.out.println("bc: " + bStr + cStr);
                System.out.println("ca: " + cStr + aStr);
                if (pass(aStr, bStr, cStr)){
                    count++;
                    System.out.println("si pasa\n");
                } else {
                    System.out.println("no pasa\n");
                }
            }
        }
        return count;
    }

    public static boolean pass(String a, String b, String c){
        String ab = a.concat(b);
        String bc = b.concat(c);
        String ca = c.concat(a);
        return (!ab.equals(bc) && !bc.equals(ca));
    }

    public static void main(String[] args){
        System.out.println(substringDivs("xyzxyz"));
        System.out.println(substringDivs("101010"));
    }
}
