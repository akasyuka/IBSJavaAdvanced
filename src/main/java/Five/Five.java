package Five;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Five {
    public static void main(String[] args) throws IOException {
        File file = new File("input5.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String[] aStr = reader.readLine().split(" ");
        List<String> listStr = new ArrayList<>();
        Collections.addAll(listStr, aStr);
        Collections.sort(listStr);
        listStr.add(" ");
        String prev = listStr.get(0);
        int count = 1;
        int maxCount = 1;
        String maxWord = " ";
        for (int i = 1; i < listStr.size(); i++) {
            if (listStr.get(i).equals(prev)) {
                count++;
            } else {
                System.out.println(prev + " встречается " + count + " раз");
                if (count >= maxCount) {
                    maxCount = count;
                    maxWord = prev;
                }
                prev = listStr.get(i);
                count = 1;
            }
        }
        System.out.println("Чаще всего встречается слово '" + maxWord + "' - " + maxCount + " раз");
    }
}
