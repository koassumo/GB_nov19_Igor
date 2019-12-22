package lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException (int numberArray) {
        System.out.println("Массив " + numberArray + " содержит некорректный элемент");
    }
}
