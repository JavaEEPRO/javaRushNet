package com.javarush.test.level05.lesson07.task01;

//Remember the word that I said to you: 'A servant is not greater than his lord.' 
//If they persecuted me, they will also persecute you. If they kept my word, they will keep yours also. (John 15:20)

package com.javarush.test.level05.lesson07.task01;

/* Create a class Friend
Create a class Friend with three initializers (three methods initialize):
    - Name
    - Name, age
    - Name, age, sex
*/

public class Friend
{
   private String name; //add your code here
   private int age;
   private char sex;
   public void initialize(String name){
       this.name = name;
   }
   public void initialize(String name, int age){
       this.name = name;
       this.age = age;
   }
   public void initialize(String name, int age, char sex){
       this.name = name;
       this.age = age;
       this.sex = sex;
   }
}
