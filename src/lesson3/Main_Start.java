package lesson3;
import java.util.*;

public class Main_Start {

    public static void main(String[] args) {

        System.out.println("\n =============== ЗАДАЧА 1 =====================================================");
        String [] arrayOfNames = { "John", "Mike", "Sam", "John", "Robin", "Gil", "Ann", "Den", "Natalie", "Ann"};
        System.out.print("Массив: ");
        for (String element: arrayOfNames) {
            System.out.print (element + ". ");
        }

        List<String> arrayList = new ArrayList<String> ();
        HashMap<String, Integer> hashMapNamesAndCount = new HashMap<> ();

        for (String name: arrayOfNames) {
            if (!hashMapNamesAndCount.containsKey(name)) hashMapNamesAndCount.put(name, 1);
            else hashMapNamesAndCount.put(name, hashMapNamesAndCount.get(name)+1);
        }
        System.out.println("\nСписок уникальных имен (с кол-вом повторений) : " + hashMapNamesAndCount);

        // ========== Варианты добавления всего массива в ArrayList ========
        // arrayList = Arrays.asList (arrayOfNames);
        // Collections.addAll(arrayList, arrayOfNames);

        // ========== Добавление только уникальных значений в ArrayList ================
        // for (String element: arrayOfNames) {
        //      if (!arrayList.contains(element)) arrayList.add(element);
        // }


        System.out.println("\n =============== ЗАДАЧА 2 =====================================================");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Smith", "89061111111");
        phoneBook.add( "Clark", "89262222222");
        phoneBook.add( "Pitt", "89263333333");
        phoneBook.add( "Clark", "89264444444");

        System.out.print("Все записи телефонной книги: "); phoneBook.get();
        System.out.print("Записи телефонной книги по фамилии Clark: "); phoneBook.get("Clark");

        //System.out.println(arrayList);


    }

}
