import java.util.*;

public class Two {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число(1 - калькулятор, 2 - поиск слова максимального по длине в массиве): ");
        int num = in.nextInt();
        if (num == 1) {
            System.out.println("Введите число(1 - суммирование, 2 - вычитание, 3 - умножение, 4 - деление): ");
            int numCalc = in.nextInt();
            in.nextLine();
            System.out.print("Введите первое число: ");
            String strOne = in.nextLine();
            System.out.print("Введите второе число: ");
            String strTwo = in.nextLine();
            float numOne = Float.parseFloat(strOne);
            float numTwo = Float.parseFloat(strTwo);
            switch (numCalc) {
                case (1):
                    System.out.print("Результат сложения = ");
                    System.out.printf("%.4f%n", numOne + numTwo);
                    break;
                case (2):
                    System.out.print("Результат вычитания = ");
                    System.out.printf("%.4f%n", numOne - numTwo);
                    break;
                case (3):
                    System.out.print("Результат умножения = ");
                    System.out.printf("%.4f%n", (numOne) * (numTwo));
                    break;
                case (4):
                    System.out.print("Результат деления = ");
                    System.out.printf("%.4f%n", (numOne) / (numTwo));
                    break;
            }
        } else if (num == 2) {
            System.out.print("Введите размерность массива слов: ");
            int s = in.nextInt();
            in.nextLine();
            System.out.print("Введите слова для заполнения массива: ");
            String[] w = new String[s];
            for (int i = 0; i < s; i++) {
                w[i] = in.nextLine();
            }

            Arrays.sort(w);
            System.out.println(w[s-1]);
        }
        in.close();
    }
}
