package corejava;

/*variables : A variable in Java is a name given to a memory location that stores a value which can be changed during program execution.

syntax of Variable Declaration:
------------------------------
dataType variableName = value;

types of variables:
------------------
1.local variable :A local variable in Java is a variable that is declared inside a method, constructor, or block and can be used only within that scope.

✅ Key Points:
Declared inside a method, constructor, or block

Only accessible within that method or block

Not accessible from outside

Must be initialized before use

No default value is assigned by JVM

2.global variable : 2 types - static(or) class variable , non-static (or) instance variable
 
instance variable :
-------------------
An instance variable is a non-static variable that is declared inside a class but outside any method, constructor, or block.
it is Accessed only using an object.

class variable :
---------------
A class variable is a variable that is declared with the static keyword inside a class (but outside any method or constructor).
it is called a static variable because it belongs to the class itself, not to any object.


*/

import java.util.Scanner;
class variables{
    int a=30;   //non -static 
    static int b=20;    //static variables
    public static void sum(){               //static method 
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a value:");
        int x = sc.nextInt();
        System.out.println("enter b  value:");
        int y = sc.nextInt();
        System.out.println(x+y);

    }
    public void sub(){					//non-static method 
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a value:");
        int p = sc.nextInt();
        System.out.println("enter b  value:");
        int q = sc.nextInt();
        System.out.println(p-q);

    }
    
    public static void main (String[] args) {
        
        variables var = new variables();    //object creation
        int c=30;                              // local variables 
        System.out.println(c);                  //calling local variables 
        System.out.println(var.a);          // calling non-static 
        System.out.println(b);              //calling static variables
        System.out.println(c);             //calling local  variables
        sum();  							//calling static method
        var.sub();                       // calling non-static method 
    }
    
}