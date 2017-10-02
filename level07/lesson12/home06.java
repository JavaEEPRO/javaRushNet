package com.javarush.test.level07.lesson12.home06;

//A little while, and now you shall not see me; and again a little while, and you shall see me:
//because I go to the Father.(John 16:16)

/* Family
Create a class Human with the fields: String name, boolean sex, int age, Human father, Human mother.
Create 9 objects of Human class and fill them in such a way as to obtain two grandfathers, two grandmothers,
a father, a mother, and three children. Display to the screen the objects to the screen.
    Tip:
    If you write your method String toString() in the class Human, then it’ll be used to display an object.
    Example output:
    Name: Anna, sex: female, age: 21, father: Paul, mother: Kate
    Name: Kate, sex: female, age: 55
    Name: Ian, sex: male, age: 2, father: Michael, mother: Anna
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather1 = new Human("John", true, 57, null, null);//add your code here
        Human grandFather2 = new Human("Paul", true, 56, null, null);

        Human grandMother1 = new Human("Sarrah", false, 35, null, null);
        Human grandMother2 = new Human("Kate", false, 55, null, null);

        Human father = new Human("Michael", true, 21, grandFather1, grandMother1);
        Human mother = new Human("Anna", false, 21, grandFather2, grandMother2);

        Human children1 = new Human("Ian", true, 2, father, mother);
        Human children2 = new Human("Sun", true, 1, father, mother);
        Human children3 = new Human("Littly", false, 1, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

    public static class Human
    {
        String name;//add your code here
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }

}
