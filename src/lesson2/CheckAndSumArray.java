package lesson2;

import java.util.Arrays;

public class CheckAndSumArray {

    public void doing (int numberArray, String myArray [][]) throws MyArraySizeException, MyArrayDataException {

        if (myArray.length != 4) throw new MyArraySizeException (numberArray);      // проверка размерности (количества строк)

        int sum = 0;
        for (int row = 0; row < myArray.length; row++) {
            if (myArray[row].length != 4) throw new MyArraySizeException(numberArray);       // проверка размерности (элементов в каждой строке)
            for (int element = 0; element < myArray[row].length; element++) {
                try {
                    sum += Integer.parseInt(myArray[row][element]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException (numberArray, row, element);
                }
            }
        }
        System.out.println("Массив " + (numberArray+1) + ": ок. Результат суммирования = " + sum);
    }
}



//        БЕЗ ОПРЕДЕЛЕНИЯ НЕКОРРЕКТНОГО ЭЛЕМЕНТА
//        for (String[] row : myArray) {
//            if (row.length != 4) throw new MyArraySizeException(numberArray);       // проверка размерности (элементов в каждой строке)
//            for (String element : row) {
//                try {
//                    sum += Integer.parseInt(element);
//                } catch (NumberFormatException e) {
//                    throw new MyArrayDataException (numberArray);
//                }
//            }
//        }
