import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        sum();
    }

    /**
     * Метод суммирует вещественные числа введенные через консоль, округляя до 4 знаков после запятой
     */
    public static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String strOne = in.nextLine();
        System.out.print("Введите второе число: ");
        String strTwo = in.nextLine();
        float numOne = Float.parseFloat(strOne);
        float numTwo = Float.parseFloat(strTwo);
        in.close();

        System.out.print("Результат сложения = ");
        System.out.printf("%.4f%n", numOne + numTwo);

    }

}
