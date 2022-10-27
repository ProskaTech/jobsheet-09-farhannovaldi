/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
package js9;

public class TestPassByValue {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);

        test(i);
        System.out.println(i);
    }

    public static void test(int j) {
        j = 33;
    }
}
