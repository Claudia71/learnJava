package oop;

public class ChildClass

        extends ParentClass
    implements Learnable

{

    private String schoolName;

//Cinstructor
    public ChildClass(
            String name,
            int age,
            String schoolName)
    {//parent constructor
        super(name, age);

        this.schoolName = schoolName;
    }

    //other methods

    public String getSchoolName() {
        return schoolName;
    }


    @Override
    //from Learnable
    public void learn() {

        System.out.println("learning in...");

    }
}
