package bank;

public class RegexTest {

    public static void main(String[] args) {


        String animals = "cat  , dogx rabbit,  -   mouse";

        String template  = "Hello user @userName. You won 100 dollars.";

        //split

        System.out.println(animals.split("\\s*(,|x|-\\s*")));



    }
}
