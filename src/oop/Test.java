package oop;



public class Test {

    public static void main(String[] args) {




        ParentClass parent = new ParentClass(
                "Mihai",
                44);

        System.out.println(parent);

        ChildClass child = new ChildClass(
                "Maria",
                3,
                "Generala 24");

        System.out.println(child);//calls child.toString

        //methods from Learnable

        System.out.println("\nMtethods from Learnable");

        //overrrided from ChildClass
        child.learn();
        //static
        Learnable.learnJava(8);
        //default (not overrided)
        System.out.println(child.speak("mama"));

        //UppercaeChild

        ChildClass uppercaseChild = new UppercaseChild(
                "Maria",
                3,
                "Generala 24");

        System.out.println("uppercaseChild is an instance of:" + uppercaseChild.getClass().getName());

        //Object <-ParentClass <- ChildClass < UppercaseChild

        System.out.println((uppercaseChild instanceof UppercaseChild));
        System.out.println((uppercaseChild instanceof ChildClass));
        System.out.println(uppercaseChild instanceof ParentClass);
        System.out.println(uppercaseChild instanceof Object);



        System.out.println(uppercaseChild);

        uppercaseChild.learn();;

        //overrided Lernable default method "speak"
        System.out.println(
                uppercaseChild.speak(
                "this is my first school year"));


    }
}
