package demo.swing.entity;

import java.io.Serializable;

public class Person implements Serializable
{
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Gender gender;



    public Person(String firstName, String lastName, int age, Gender gender )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
        this.gender=gender;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }



    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + gender;
    }
}
