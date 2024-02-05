package classwork.example01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.append("Hello!");
            bw.newLine();
        }

    }
}
