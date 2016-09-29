package com.company;

import java.io.Serializable;

/**
 * Created by bathoryalex on 16/09/29.
 */
public class Person implements Serializable
{

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public static void main(String[] args)
    {

    }
}
