package part1;

public class NormalJavaWithoutMultiThreading {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println("i is: " + i);
        }

        for (int i = 11; i < 21; i++) {
            System.out.println("i is: " + i);
        }
    }
}
