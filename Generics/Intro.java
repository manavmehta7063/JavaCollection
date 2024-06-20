//!                         Generics Introduction
/*

Comparable c = new Date();
System.out.println(c.compareTo("red")); 

-> declares that c is a reference variable whose type is Comparable and invokes 
the compareTo method to compare a Date object with a string. The code compiles fine, but 
it has a runtime error because a string cannot be compared with a date.

Comparable<Date> c = new Date();         -> Generics Type
System.out.println(c.compareTo("red"));

-> declares that c is a reference variable whose type is 
Comparable<Date> and invokes the compareTo method to compare a Date object with a 
string. This code generates a compile error, because the argument passed to the compareTo
method must be of the Date type. Since the errors can be detected at compile time rather than 
at runtime, the generic type makes the program more reliable

*/

/*

Generic types must be reference types.

ArrayList<int> intList = new ArrayList<>();       😵‍💫❌

ArrayList<Integer> intList = new ArrayList<>();    👍

 */

//? A generic type can be defined for a class or interface. A concrete type must be 
//? specified when using the class to create an object or using the class or interface to
//? declare a reference variable.

import java.util.ArrayList;

public class Intro{
    public static void main(String[] arr){
        // System.out.println("Hello World!");

        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("Manav");
        stack1.push("Hetul");
        stack1.push("Keval");

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        System.out.println(stack2);
        System.out.println(stack1);
    }
}

class GenericStack<E>{
    ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize()-1);
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {

        return "stack : "+ list.toString();
    }
}