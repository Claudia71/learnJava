package oop;

public class UppercaseChild extends ChildClass{

    public UppercaseChild(
            String name,
            int age,
            String schoolName) {
        super(name, age, schoolName);
    }
    @Override
    //override Learnable default method
    public String speak (String text){

        return  text.toUpperCase();
    }
}
