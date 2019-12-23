package lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException (int numberArray, int row, int element) {
        System.out.println("Массив " + (numberArray+1) + " содержит некорректный элемент по адресу: строка " + (row+1) + ", столбец " + (element+1));
    }
}
