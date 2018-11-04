package bank;

import utils.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;

    private Employer employer;

    private String location;

    public Person(String name, Employer employer, String location) {

        this.name = name;
        this.employer = employer;
        this.location = location;
    }

    @Override
    public String toString(){

        return String.format(
                "\nName: %s\nEmployer: %s\nLocation: %s",
                name,
                employer.name(),
                location);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Employer getEmployer() {
        return employer;
    }


    public String getLocation() {
        return location;
    }

    public static Person stringToPerson(String text) {
        //text =" Anda, Bucuresti,   Visma"

        String[] textTokens = text.split("\\s*,\\s*");

        String name = textTokens[0];
        String location = textTokens[1];

        //Employer.Visma.name()---> returns "Visma"
        //Employer.valueOf("Visma") ---> returns Employer.Visma
        Employer employer = Employer.valueOf(textTokens[2]);



        return new Person("Anda", Employer.Visma, "Bucuresti");

    }

    public static void main(String[] args){

        String text = "Anda, Bucuresti,   Visma";

        System.out.println(stringToPerson(text));
    }

    public static List<Person> fileToPersonList(String localFilePath){

        FileUtils.extractNonEmptyLines
    }

    public static List<String> fileLinesToList(String localFilePath) throws IOException {

        Path employeesFullPath = FileUtils.getLocalPath(
                ResourcesDirectories.BankResources.name(),
                localFilePath);

        List<String> fileLines = Files.readAllLines(employeesFullPath);

        for(String line : fileLines){

            System.out.println(line);
        }


        return Collections.emptyList();
    }

}

