package lesson3;

import java.util.HashMap;

public class PhoneBook {

    private HashMap hashMap;

    public PhoneBook () {
        hashMap = new HashMap<>();
    }

    public void add (String surname, String phoneNumber) {
        if (hashMap.containsKey(surname)) {
            hashMap.put(surname, (hashMap.get(surname) + " " + phoneNumber));
        }
        else {
            hashMap.put(surname, phoneNumber);
        }
    }

    public void get (){
        System.out.println(hashMap);
    }

    public void get (String surname){
        System.out.println(hashMap.get(surname));
    }
}
