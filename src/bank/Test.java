package bank;

public class Test {

    public static void main(String[] args) {


        System.out.println(System.getProperty("test"));
        System.out.println(System.getProperty("name"));
        //TODO move to separate files
/*        testFileUtils();

        throwablesTest();*/

/*        List<String> employeesLines = fileLinesToList(
                BankResources.name(),
                "employees.csv");

        List<String> nonEmptyEmployeesLines = extractNonEmptyLines(employeesLines);


        for(String line : nonEmptyEmployeesLines){
            System.out.println(line);
        }*/
        //nonEmptyEmployeesLines.forEach(System.out::println);


    }


}
