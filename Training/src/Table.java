public class Table {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a,b)");
        for (int a = 1, b = 2; a <= 5; a++, b++) {
            System.out.println(a + "\t" + b + "\t" + power(a, b));
        }
    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}
