package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bathoryalex on 16/09/29.
 */
public class ShowPerson
{
    private Language language;
    private List<Person> personList;


    public ShowPerson(Language language)
    {
        this.language = language;
    }

    private void personDeserializator()
    {
        try
        {
            FileInputStream fis = new FileInputStream("D:\\CodeCool\\Coding Dojo\\29 September 2016\\NameShower\\names.out");
            ObjectInputStream ois = new ObjectInputStream(fis);

        personList = (List<Person>) ois.readObject();

            ois.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void displayPerson()
    {
        personDeserializator();
        if (language == Language.EN)
        {
            for (Person currentPerson : personList)
            {
                System.out.println(currentPerson.getFirstName() + " " + currentPerson.getLastName() + " " + currentPerson.getAge());
            }
        } else if (language == Language.HU)
        {
            for (Person currentPerson : personList)
            {
                System.out.println(currentPerson.getLastName() + " " + currentPerson.getFirstName() + " " + currentPerson.getAge());
            }
        }
    }
}