package bank;

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

    public String toString();{
        return String.format(
                "\nName: "
        )
    }
}
