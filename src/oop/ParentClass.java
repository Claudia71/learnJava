package oop;

public class ParentClass {//extends Object

    private String name;
    private int age;
//constructor
    public ParentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //public ParentClass(){

        //this.name = "";
        //this.age = age;


    public String getName(){

        return name;
    }
    public int getAge(){
        return age;
}
@Override
//from Object
    public String toString(){

        return String.format(
                "Name: %s - Age: %s",
                name,
                age);

}
}


