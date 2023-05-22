import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Дан массив, длинной 5.");

        double[] number3 = new double[5];
        System.out.println(Arrays.toString(number3));

        System.out.println("Задайте свои значения для массива:");
        System.out.println("");
        System.out.println("Введите первое число:");
        number3[0] = sc.nextInt();
        System.out.println(Arrays.toString(number3));
        System.out.println("Введите второе число:");
        number3[1] = sc.nextInt();
        System.out.println(Arrays.toString(number3));
        System.out.println("Введите третье число:");
        number3[2] = sc.nextInt();
        System.out.println(Arrays.toString(number3));
        System.out.println("Введите четвертое число:");
        number3[3] = sc.nextInt();
        System.out.println(Arrays.toString(number3));
        System.out.println("Введите пятое число:");
        number3[4] = sc.nextInt();
        System.out.println(Arrays.toString(number3));

        System.out.println("Введите число, чтобы вывести числа из массива кратные этому числу :");

        double personNumber = sc.nextInt();
        for (int x = 0; x < number3.length; x++) {
            if (number3[x] % personNumber == 0) {
                System.out.println(number3[x]);
            }

        }
    }
}
