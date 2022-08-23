package Three;

import java.util.Random;

public class ThreeOne {
    public static void main(String[] args) {
        int[] a = new int[20];
        int min = 10;
        int imin = -1;
        int max = -10;
        int imax = -1;

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            a[i] = random.nextInt(20) - 10;
            System.out.println(a[i]);
            if ((a[i] >= 0) && (a[i] < min)) {
                min = a[i];
                imin = i;
            } else if ((a[i] < 0) && (a[i] > max)) {
                max = a[i];
                imax = i;
            }
        }
        System.out.println("Минимальный среди положительных под индексом " + imin + " равняется " + min);
        System.out.println("Максимальный среди отрицательных под индексом " + imax + " равняется " + max);
        System.out.println("Меняем местами");
        int t = a[imin];
        a[imin] = a[imax];
        a[imax] = t;
    }
}
