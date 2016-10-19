import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/10/17 0017.
 */
public class Factorial {
    public static String result(int input){
        BigInteger sum = new BigInteger("1");
        for (int i = input; i > 0; i--) {
            sum=sum.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(sum);
        return sum.toString();
    }

    public static String subResult(int input, int start, int end){
        BigInteger sum = new BigInteger("1");
        String sum1 = null;
        try {


            for (int i = input; i > 0; i--) {
                sum = sum.multiply(new BigInteger(String.valueOf(i)));
            }
            sum1 = sum.toString().substring(start, end);

        }catch (StringIndexOutOfBoundsException s){
            System.out.println("截的位数过此数字最高位");
        }
        if (sum1!=null)
        System.out.println(sum1);
        return sum1;
    }

    public static void main(String[] args) {
        int input,start,end;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        start = scanner.nextInt();
        end = scanner.nextInt();
        Factorial.result(input);
        Factorial.subResult(input,start,end);
    }
}
