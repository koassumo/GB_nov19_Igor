package lesson3;
import java.util.*;

public class Main_Start {

    public static void main(String[] args) {

        System.out.println("\n =============== ЗАДАЧА 1 =====================================================");
        String [] arrayOfNames = { "John", "Mike", "Sam", "John", "Robin", "Gil", "Ann", "Den", "Natalie", "Ann", "Ann"};
        System.out.print("Массив: ");
        for (String element: arrayOfNames) {
            System.out.print (element + ". ");
        }

        ArrayList<String> arrayList = new ArrayList<> ();
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
        Book book = new Book();
        book.add( "Smith", "89262222222");
        book.add( "Clark", "89262222222");
        book.add( "Pitt", "89263333333");
        book.add( "Clark", "89264444444");
        book.add( "Clark", "89265555555");

        System.out.print("Все записи телефонной книги: "); book.get();
        System.out.print("Записи телефонной книги по фамилии Clark: "); book.get("Clark");




    }

}
