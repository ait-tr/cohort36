package classwork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main07 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Natasha Wiener", "Boris Iurciuc", "Maria Gorban", "Dennis Schonberg", "Dmitrii Heinrich", "Illia Tkachov",
                "Liliana Platon"));

        Comparator<String> lengthComparator = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return -1;
            } else if (s1.length() < s2.length()) {
                return 1;
            }
            return 0;
        };
        System.out.println(list);
        list.sort(lengthComparator);
        System.out.println(list);

        Comparator<String> iLetterComparator = (s1, s2) -> {
            int counter1 = 0;
            int counter2 = 0;
            for (char c : s1.toCharArray()) {
                if (Character.toLowerCase(c) == 'i') {
                    counter1++;
                }
            }
            for (char c : s2.toCharArray()) {
                if (Character.toLowerCase(c) == 'i') {
                    counter2++;
                }
            }
            return Integer.compare(counter1, counter2);
        };

        list.sort(iLetterComparator);
        System.out.println(list);
    }
}
