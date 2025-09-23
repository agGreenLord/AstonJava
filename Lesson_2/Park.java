package Lesson_2;

public class Park {
    private String parkName;
    public Attraction attraction;

    public Park(String name) {
        this.parkName = name;
    }

    public String getParkName() {
        return parkName;
    }

    public class Attraction {
        private String name;
        private String workTime;
        private int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkTime() {
            return workTime;
        }

        public int getPrice() {
            return price;
        }
    }
}

