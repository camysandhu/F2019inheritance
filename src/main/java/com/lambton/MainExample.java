package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class MainExample
{
    public static void main(String[] args)
    {
        Person p1 ;
        Student s1 = new Student(1,
                "Camy",
                "Sandhu",
                LocalDate.now(),
                "Male",
                "MADT",
                2);

        p1=s1;
        p1.display();

        Faculity f1= new Faculity(1,"Camy","Sandhu",LocalDate.now(),"Male","Software Engineer",1000,"Mobile Software Development");


        }
}
