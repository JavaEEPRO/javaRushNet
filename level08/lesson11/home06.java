package com.javarush.test.level08.lesson11.home06;

//That the saying of Jesus might be fulfilled, which he spake, signifying what death he should die (John 18:32)

import java.util.ArrayList;

/* The whole family is together
Create a class Human with the fields: String name, boolean sex, int age, ArrayList<Human> children.
    2. Create 9 objects and fill them in such a way as to obtain two grandfathers, two grandmothers,
    a father, a mother, and three children.
    3. Display to the screen all the Human objects.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> tesla = new ArrayList<Human>();
        Human grandpa1 = new Human("Tesla", true, 34, tesla);    //add your code here

        ArrayList<Human> tesla2 = new ArrayList<Human>();
        Human grandpa2 = new Human("Tesla2", true, 34, tesla2);

        ArrayList<Human> larciss = new ArrayList<Human>();
        Human grandma = new Human("Larciss", false, 35, larciss);

        ArrayList<Human> larciss2 = new ArrayList<Human>();
        Human grandma2 = new Human("Larciss2", false, 35, larciss2);

        ArrayList<Human> mamka = new ArrayList<Human>();
        Human mum = new Human("Mamka", false, 25, mamka);

        ArrayList<Human> papka = new ArrayList<Human>();
        Human dad = new Human("Papka", true, 25, papka);

        ArrayList<Human> sunka = new ArrayList<Human>();
        Human child1 = new Human("Sunnok", true, 13, sunka);

        ArrayList<Human> dochka = new ArrayList<Human>();
        Human child2 = new Human("Sunnichka", false, 11, dochka);

        ArrayList<Human> sunka2 = new ArrayList<Human>();
        Human child3 = new Human("Sun", true, 15, sunka2);

        tesla.add(dad);
        larciss.add(dad);

        tesla2.add(mum);
        larciss.add(mum);

        papka.add(child1);
        papka.add(child2);
        papka.add(child3);

        mamka.add(child1);
        mamka.add(child2);
        mamka.add(child3);

        System.out.println(grandpa1);
        System.out.println(grandpa2);

        System.out.println(grandma);
        System.out.println(grandma2);

        System.out.println(mum);
        System.out.println(dad);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;//add your code here
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", children: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
