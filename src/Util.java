public class Util {

    public static int trace2(int a) {
        a += 1;
        return trace3(a);
    }

    public static int trace3(int a) {
        a *= 2;
        return Math.multiplyExact(a, a);
    }
}
