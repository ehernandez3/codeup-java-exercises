package IOPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIo {
    //Create a method for retrieving file contents.
    //The method should accept a string that is the location of the file,
    //and return a list of strings where each string is a line in the file.

    public static void main(String[] args) {
        System.out.println(getFilesContents("src/IOPractice/test.txt"));
        System.out.println(addToFile("Hello"));
    }


    public static List<String> getFilesContents(String filePath){
        Path fp = Paths.get(filePath);

            List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(fp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }


    public static List<String> addToFile(String newContent) {
        Path fp = Paths.get("src/IOPractice/test.txt");

        List<String> newLines = Arrays.asList(newContent);

        try {
            Files.write(fp, newLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newLines;
    }
}

