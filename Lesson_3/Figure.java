package Lesson_3;

public interface Figure {
    double area();
    double perimeter();
    String getBackground();
    String getBorder();
    default void printInfo() {
        System.out.println(
            "Фигура " + getClass().getSimpleName()
            + " | Площадь: " + area()
            + " | Периметр: " + perimeter()
            + " | Заливка: " + getBackground()
            + " | Граница: " + getBorder()
        );
    }
}
