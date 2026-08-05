import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
        fun(2, 4, 5, 6, 7, 8, 43, 2, 432, 33);
        fun();//this will be an empty array
        mul(3, 5, "bkcjba", "fueywg");
    }

    static void fun(int... v) {//stores as array of int
        System.out.println(Arrays.toString(v));
    }

    static void mul(int a, int b, String... v) {//u can have multiple arguments// t
        System.out.println(a + b);
        System.out.println(Arrays.toString(v));
        //variable length argument should be always at the end
    }
}