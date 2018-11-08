package oop;

public interface Learnable {


    // static method
    // CANNOT be overrided, this is a class method
    static void learnJava(int version) {

        System.out.println("Learn Java SE version " + version);
    }

    // method signature, no body
    // MUST be implemented in classes that IMPLEMENT Learnable
    void learn();

    // default method
    // CAN be overrided
    default String speak(String text) {
        helper(); // private method example
        return text;
    }


    // visible only internal
    private String helper() {

        return "help!";
    }

}