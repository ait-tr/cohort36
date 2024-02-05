package classwork.example02;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    Прочитать ранее записанный файл в список строк
     */

    public static void main(String[] args) throws IOException {
        List<String> fileContent = new ArrayList<>();
        File file = new File("text.txt");

        Scanner scanner = new Scanner(new FileReader(file));

        while (scanner.hasNext()) {
            fileContent.add(scanner.nextLine());
        }

        fileContent.forEach(System.out::println);
    }
}
