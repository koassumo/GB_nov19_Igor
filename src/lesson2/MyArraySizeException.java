package lesson2;

public class MyArraySizeException extends Exception{

    public MyArraySizeException(int numberArray) {
        System.out.println("Массив " + (numberArray+1) + " имеет неверную размерность");
    }

}
