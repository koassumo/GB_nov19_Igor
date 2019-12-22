package lesson2;

public class MyArraySizeException extends Exception{

    public MyArraySizeException(int numberArray) {
        System.out.println("Массив " + numberArray + " имеет неверную размерность");
    }

}
