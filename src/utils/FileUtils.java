package utils;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface FileUtils {

    public static Path getLocalPath(String...more) {
        return Paths.get(
                System.getProperty("user.dir"),

                more);

    }
}
