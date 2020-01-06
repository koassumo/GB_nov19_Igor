package lesson3;

import java.util.ArrayList;
import java.util.HashMap;

public class Book {

    public HashMap <String, ArrayList<String>> hashMap;
    public ArrayList <String> listOfPhones;

    public Book () {
        hashMap = new HashMap<>();
    }

    public void add (String surname, String phoneNumber) {
        if (hashMap.containsKey(surname)) listOfPhones = hashMap.get(surname);
        else listOfPhones = new ArrayList<>();
        listOfPhones.add (phoneNumber);
        hashMap.put(surname, listOfPhones);
    }

    public void get () {
        System.out.println(hashMap);
    }

    public void get (String surname) {
        System.out.println(hashMap.get(surname));
    }

}
