package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bathoryalex on 16/09/29.
 */
public class Main
{
    public static void main(String[] args)
    {

        Person person1 = new Person("Alex", "Bathory", 23);
        Person person2 = new Person("Matej", "Ronai", 22);
        Person person3 = new Person("Bozsi", "Mama", 100);

        List <Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        try
        {
            FileOutputStream fos = new FileOutputStream("D:\\CodeCool\\Coding Dojo\\29 September 2016\\NameShower\\names.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(personList);

            oos.flush();
            oos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        ShowPerson sp = new ShowPerson(Language.HU);
        sp.displayPerson();
    }
}