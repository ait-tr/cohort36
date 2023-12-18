package classwork.advanced;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
/*
Просканировать папку и вывести все файлы которые в ней есть
 */

    public static List<String> getAllFilesPath(String path) {
        List<String> res = new ArrayList<>();
        File[] files = new File(path).listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                res.addAll(getAllFilesPath(file.getAbsolutePath()));
            } else {
                res.add(file.getAbsolutePath());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String file = "F:\\Moe\\prog\\java\\cohort36\\basic_programming\\lesson_43";
        List<String> files = getAllFilesPath(file);
        files.forEach(System.out::println);
    }
}
