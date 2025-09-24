package Lesson_4;

public class MyArraySizeExeption extends Exception {
    public MyArraySizeExeption() {
        super("Неправильный размер массива");
    }
}