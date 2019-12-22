package lesson2;

import java.util.Arrays;

public class CheckAndSumArray {

    public void doing (int numberArray, String myArray [][]) throws MyArraySizeException, MyArrayDataException {

        if (myArray.length != 4) throw new MyArraySizeException (numberArray);      // проверка размерности (количества строк)

        int sum = 0;
        for (String[] row : myArray) {
            if (row.length != 4) throw new MyArraySizeException(numberArray);       // проверка размерности (элементов в каждой строке)
            for (String element : row) {
                try {
                    sum += Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException (numberArray);
                }
            }
        }

        System.out.println("Массив " + numberArray + ": ок. Результат суммирования = " + sum);
    }

}

