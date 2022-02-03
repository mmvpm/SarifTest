public class Main {

    public static int trace1(int a) {
        return Util.trace2(a);
    }

    public static int getByIndex(int[] array, int index) {
        if (index == -2)
            throw new RuntimeException();
        int tmp = 1 / index;
        return array[index] + tmp;
    }

    public static void main(String[] args) {}
}
