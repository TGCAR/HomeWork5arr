import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Task 1");
//        System.out.println();
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        float[] floats = new float[3];
        floats[0] = 1.57f;
        floats[1] = 7.654f;
        floats[2] = 9.986f;
        int[] arbitrary = {2, 5, 8, 9, 3, 4};
        System.out.println();
        System.out.println("Task 2");
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (float a = 0; a < floats.length; a++) {
            System.out.print(floats[(int) a]);
            if (a < floats.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = 0; b < arbitrary.length; b++) {
            System.out.print(arbitrary[b]);
            if (b < arbitrary.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Task 3");
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (float a = floats.length - 1; a >= 0; a--) {
            System.out.print(floats[(int) a]);
            if (a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = arbitrary.length - 1; b >= 0; b--) {
            System.out.print(arbitrary[b]);
            if (b > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Task 4");
        System.out.println();
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 != 0)
                numbers[i] += 1;
        {
            System.out.println(Arrays.toString(numbers));
        }
    }
}




