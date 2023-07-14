package be.bstorm.demos.demoCollection;

import be.bstorm.demos.basicClass.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        ArrayList arr = new ArrayList();
//
//        arr.add("toto");
//        arr.add(42);
//        arr.add(true);
//        arr.add(new Person("bya","seb"));
//
//        for (Object o : arr){
//
//            if(o instanceof String s){
//                System.out.println(s);
//            }
//            if(o instanceof Integer i){
//                int result = i + 5;
//                System.out.println(result);
//            }
//        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);

        ArrayList<String> names = new ArrayList<>();
        names.add("Pierre");
        names.add("Pol");
        names.add("Jacque");

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Cesar","Jule"));



    }
}
