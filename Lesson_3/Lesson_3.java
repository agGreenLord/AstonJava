package Lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        Cat catSam = new Cat("Сэм", 40);
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(150);
        dogBobik.sweem(5);
        dogBobik.run(550);
        catSam.run(100);
        catSam.sweem(5);
        catSam.eating(30);
        catSam.eating(10);

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Дружок", 40);
        catArray[1] = new Cat("Бариск", 60);
        catArray[2] = new Cat("Рыжик", 30);
        catArray[3] = new Cat("Мотя", 10);
        catArray[4] = new Cat("Снежок", 20);
        for (int i = 0; i < 5; i++) {
            catArray[i].eating(10);
        }
        for (int i = 0; i < 5; i++) {
            catArray[i].getSatiety();
        }
        catArray[2].eating(30);

        Figure circle = new Circle(4, "Красный", "Желтый");
        circle.printInfo();
        Figure triangle = new Triangle(3, 5, 7, "Черный", "Фиолетовый" );
        triangle.printInfo();
        Figure rectangle = new Rectangle(3, 5, "Белый", "Фиолетовый" );
        rectangle.printInfo();
    }
}


