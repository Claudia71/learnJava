package base;

public class Test {

    public static void main (String...args){

        String name = "SDA";
        Loops loops = new Loops();

        loops.printSimpleArray();
        String message = Loops.message();
        System.out.println(Loops.message());
    }
}
