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

        Faculity f1= new Faculity(1, "Camy",
                "Sandhu",
                LocalDate.now(),
                "Male",
                "Software Engineer",
                (float) 1000.000,
                "Mobile Software Development") ;

        p1=f1;
        p1.display();


        double a = 10000.00;
         int x = 0b0101010;
        System.out.println(x);

        int y= 00017;
        System.out.println(x);

        int z= 0x17ABC;
        System.out.println(z);

        double b = 1_00_____000.00;
        System.out.println(b);


        }
}
