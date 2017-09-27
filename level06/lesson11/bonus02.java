package com.javarush.test.level06.lesson11.bonus02;

//Jesus answered, "I told you that I am he. If therefore you seek me, let these go their way," (John 18:8)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Add new functionality to the program.
Old task: Every cat has a name and a mom cat. Write a class to describe this situation.
Create two objects: a daughter cat and a mom cat. Display them to the screen.

    New task: Every cat has a name, a dad cat and a mom cat. Write a class to describe this situation.
    Create 6 objects: mom, dad, son, daughter, grandma (mom’s mom) and grandpa (dad’s dad).
    Display them to the screen as follows: grandpa, grandma, dad, mom, son and daughter.

    Example input:
    grandpa Vinny
    grandma Maisy
    dad Kaos
    mom Velvet
    son Mario
    daughter Fluffy

    Example output:
    Cat name is grandpa Vinny, no mother, no father
    Cat name is grandma Maisy, no mother, no father
    Cat name is dad Kaos, no mother, father is grandpa Vinny
    Cat name is mom Velvet, mother is grandma Maisy, no father
    Cat name is son Mario, mother is mom Velvet, father is dad Kaos
    Cat name is daughter Fluffy, mother is mom Velvet, father is dad Kaos
*/

public class Solution
{
        public static void main(String[] args) throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String grandpa = br.readLine();
            String grandma = br.readLine();
            String dad = br.readLine();
            String mum = br.readLine();
            String son = br.readLine();
            String daughter = br.readLine();

            Cat grandFather = new Cat(grandpa);
            Cat grandMother = new Cat(grandma);
            Cat father = new Cat(dad, grandFather, null);
            Cat mother = new Cat(mum, null, grandMother);
            Cat sunny = new Cat(son, father, mother);
            Cat daughty = new Cat(daughter, father, mother);

            System.out.println(grandFather);
            System.out.println(grandMother);
            System.out.println(father);
            System.out.println(mother);
            System.out.println(sunny);
            System.out.println(daughty);
        }

        public static class Cat {
            private String name;
            private Cat parentMother;
            private Cat parentFather;

            Cat(String name) {
                this.name = name;
            }

            Cat(String name, Cat parentFather, Cat parentMother) {
                this.name = name;
                this.parentFather = parentFather;
                this.parentMother = parentMother;
            }

            @Override
            public String toString() {
                return "Cat name is " + name +
                        ((parentMother != null) ? ", mother is " + parentMother.name : ", no mother") +
                        ((parentFather != null) ? ", father is " + parentFather.name : ", no father");
            }
        }
    }
