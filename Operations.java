/* Write methods to implement the multiply, subtract, divide
* operations for integers. Use only the add operator.
 */
public class Operations {

    public static int negate(int num){
        int neg = 0;
        int newSign = num < 0 ? 1 : -1;
        while (num != 0){
            num += newSign;
            neg += newSign;
        }
        return neg;
    }

    public static int minus(int a, int b){
        return a + negate(b);
    }

    public static int multiply(int a, int b){
        if (b < a) return multiply(b, a);
        int product = 0;
        int absa = abs(a);
        int absb = abs(b);
        for (int i = absa; i > 0; i = minus(i, 1)){
            product += absb;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0) ){
            return negate(product);
        }
        return product;
    }

    public static int abs(int num){
        if (num > 0) return num;
        return negate(num);
    }

    public static int divide (int a, int b) throws java.lang.ArithmeticException {
        if (b == 0){throw new java.lang.ArithmeticException("ERROR");}
        int result = 0;
        int absa = abs(a);
        int absb = abs(b);
        int b_aux = absb;
        while (b_aux <= absa){
            b_aux += absb;
            result++;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0 )){
            return negate(result);
        }
        return result;
    }

//    public static void main(String[] args){
//        System.out.println(minus(16, 4));
//        System.out.println(minus(-16, 4));
//        System.out.println(minus(-19, -4));
//        System.out.println(multiply(16, 4));
//        System.out.println(multiply(-16, 4));
//        System.out.println(multiply(-19, -4));
//        System.out.println(divide(16, 4));
//        System.out.println(divide(-16, 4));
//        System.out.println(divide(-19, -4));
//    }
}

