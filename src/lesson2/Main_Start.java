package lesson2;

import java.lang.reflect.Array;

public class Main_Start {

    public static void main(String[] args) {

        String myArray [][][] = new String[4][][];  // создаем массив из 4 разных двумерных массивов

        myArray [0] = new String [][]{              // №1. некорректная размерность - мало строк
                {"0", "1", "0", "1"},
                {"0", "1", "0", "1"}
        };

        myArray[1] = new String [][] {              // №2. некорректная размерность - много элементов в 1 из строк
                {"0", "1", "0", "1"},
                {"0", "1", "0", "1"},
                {"0", "1", "0", "1", "0", "1", "0", "1"},
                {"0", "1", "0", "1"}
        };

        myArray[2] = new String [][] {              // №3. нормальный массив
                {"0", "1", "0", "1"},
                {"0", "1", "0", "1"},
                {"0", "1", "0", "1"},
                {"0", "1", "0", "1"}
        };

        myArray[3] = new String [][] {              // №4. некорректные элементы
                {"0", "1", "0", "1"},
                {"0", "1", "0", "текст вместо числа"},
                {"0", "1", "0", "1"},
                {"0", "1", "0", "1"}
        };

        CheckAndSumArray checkAndSumArray = new CheckAndSumArray();
        // а нужен ли этот объект? или правильнее метод doing в static превратить, и использовать класс CheckAndSumArray просто как отдельную процедуру

        for (int numberArray = 0; numberArray < myArray.length; numberArray++) {
            System.out.println();
            try {
                checkAndSumArray.doing (numberArray, myArray[numberArray]);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            } catch (MyArrayDataException e1) {
                e1.printStackTrace();
            }
        }

    }
}
