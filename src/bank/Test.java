package bank;



import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static utils.FileUtils.getLocalPath;

public class Test {
    public static void main(String[] args) throws IOException {

        //testFileUtils();

        //throwablesTest();

        Person.fileLinesToList("employees.csv");

    }

    private static void throwablesTest() {
        try {

            //checked exception
            //2 WAYS OF HANDELING

            throw new Exception("Test exception");

            //unchecked exception
            //DOES NOT NEED HANDLING IN CODE FOR COMPILATION
            //throw new Error("Test exception");
        } catch (Throwable e) {
            System.out.println(e.getClass().getSimpleName() + ":" + e.getMessage());
        }

        //not reacheble

        //System.out.println("END");
    }

    private static void testFileUtils() {
        final String USER_DIR = System.getProperty("user.dir");


        System.out.println("User directory: "
               +  USER_DIR);

        Path fullFilePath = getLocalPath(
                ResourcesDirectories.BankResources.name(),
                "employees.csv");

        System.out.println(fullFilePath);


        //prints user.dir
        //System.out.println(getLocalPath());

        System.out.println(Paths.get(
                "C:\\Users\\User\\Desktop\\SDA_EX\\learnJava\\BankResources\\employees.csv"));
    }
}
