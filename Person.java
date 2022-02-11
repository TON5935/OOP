import java.util.*;

class Person {
    
    protected String name;
    protected int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void printInformation() {

        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
    }

    public static void main(String[] args) {
        Instructor assign = new Instructor();
        assign.setName("Sonevixay");
        assign.setAge(20);
        assign.printInformation();
        assign.assign();
    }
}

class Instructor extends person {

    public void assign() {
        System.out.println(" Assign ");
    }
}
class Student extends person {
    protected int year;
}

class Course {
    protected String name;
    protected Double grade;
}

class Select{
    protected float mark;
    protected String location;
 
}
