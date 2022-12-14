import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class FileArray{
    public static ArrayList<File> readDir(String path){
        File file = new File(Paths.get("").toAbsolutePath().toString()+path);
        if (!file.exists() || !file.isDirectory())
            throw new IllegalArgumentException("Не корректный путь");
        ArrayList<File> listOfFiles = new ArrayList<>();
        Collections.addAll(listOfFiles, file.listFiles());
        try {
            for (int i = 0; i < 5; i++)
                System.out.println(listOfFiles.get(i).getName());
        } catch (Exception e) {
            System.out.println("Файлов меньше 5");
        }
        return listOfFiles;
    }
}
