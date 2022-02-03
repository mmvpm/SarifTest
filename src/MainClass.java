public class MainClass {

    public static int callCallExample(boolean condition, int[] a, int i) {
        return callExample(condition, a, i);
    }

    public static int callExample(boolean condition, int[] a, int i) {
        if (condition) {
            return example(a, i);
        } else {
            return example(a, i + 1);
        }
    }

    public static int example(int[] a, int i) {
        if (i == -2)
            throw new RuntimeException();
        int tmp = 1 / i;
        return a[i] + tmp;
    }

    static class Foo {
        public static int n = 2;

        int[] a;

        Foo(int[] _a) {
            a = _a;
        }
    }

    public static int function(Foo foo) {
        return 1 / foo.a[Foo.n];
    }

    public int utilSqrt(boolean condition) {
        Util util = new Util();
        if (condition)
            return util.utilFunction(0);
        else
            return util.utilFunction(100000);
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
