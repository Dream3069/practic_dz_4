import java.util.ArrayList;
import java.util.Collections;

class StringArray {
    private ArrayList<String> strings;

    public StringArray() {
        strings = new ArrayList<>();
    }

    public void addString(String string) {
        strings.add(string);
        Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length())); // Сортировка по длине
    }

    public String getMaxLengthString() {
        if (strings.isEmpty()) {
            return null;
        }
        return Collections.max(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0;
        }
        int totalLength = strings.stream().mapToInt(String::length).sum();
        return (double) totalLength / strings.size();
    }
}

// Главный класс для тестирования
public class dz3_2 {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        stringArray.addString("Привет");
        stringArray.addString("Мир");
        stringArray.addString("Как дела?");

        System.out.println("Максимальная по длине строка: " + stringArray.getMaxLengthString());
        System.out.println("Средняя длина строк: " + stringArray.getAverageLength());
    }
}
