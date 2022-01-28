public class Main {

    public static int example(int[] a, int i) {
        if (i == -2)
            throw new RuntimeException();
        int tmp = 1 / i;
        return a[i] + tmp;
    }

    public static void main(String[] args) {
        System.out.println(2);
    }
}
