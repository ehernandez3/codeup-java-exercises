package IOPractice;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIo {
    public String getFilesContents(String fileLocaiton){

        String fileContents;
        Path fileLocation = Paths.get("./test.txt");
        System.out.println(fileLocaiton);
        return fileContents;

    }
}
