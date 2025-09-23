package Lesson_3;

public class Animal {
    public static int bowlOfFood = 100;
    public void run(int length) {
        System.out.println("Животное пробежало:" + length);
    }
    public void sweem(int length) {
        System.out.println("Животное проплыло: " + length);
    }
}

class Cat extends Animal{
    private String name;
    private boolean satiety = false;
    private int eatNeeded;
    public Cat(String name, int eatNeeded) {
        this.name = name;
        this.eatNeeded = eatNeeded;
    }
    @Override
    public void run(int length) {
        if (length <= 200 && length > 0) {
        System.out.println(this.name + " пробежал:" + length + "м");
        } else {
            System.out.println(this.name + " не может бежать так далеко");
        }
    }

    @Override
    public void sweem(int length) {
        System.out.println(this.name + " - кот, а коты не плавыают");
    }

    public void eating(int countOfEat) {
        if (countOfEat <= Animal.bowlOfFood) {
            Animal.bowlOfFood = Animal.bowlOfFood - countOfEat;
            this.eatNeeded = this.eatNeeded - countOfEat;
            System.out.println(this.name + " съел " + countOfEat + " еды. В миске осталось " + Animal.bowlOfFood );
            if (this.eatNeeded <= 0 ) {
                // System.out.println("Кот сыт!");
                this.satiety = true;
            }

        } else {
            System.out.println("В миске нехватает еды!");
        }
    }

    public void addEatInBowl(int count) {
        Animal.bowlOfFood = Animal.bowlOfFood + count;
        System.out.println("Миска наполнена, теперь в миске: " + Animal.bowlOfFood + " еды");
    }

    public boolean getSatiety() {
        if (this.satiety) {
        System.out.println("Кот " + this.name + " сыт!");
        } else { 
            System.out.println("Кот " + this.name + " еще голодный!");
        }
        return this.satiety;
    }
}

class Dog extends Animal{ 
        private String name;
        public Dog(String name) {
            this.name = name;
        }
        @Override
        public void run(int length) {
            if (length <= 500 && length > 0) {
                System.out.println(this.name + " пробежал: " + length + "м");
            } else {
                System.out.println(this.name + " не может столько пробежать");
            }
        }
        @Override
        public void sweem(int length) {
            if (length > 0 && length <= 10) {  
            System.out.println(this.name + " проплыл " + length + "м");
        } else {
            System.out.println(this.name + " не может столько проплыть");
        }
    }
}
