

public class Lesson_2 {
    public static void main(String[] args){
        Product product1 = new Product("Michel", "13.01.2000", "DJI", "USA", 10000, false);
        product1.infoOfProduct();

        Product[] productArray = new Product[5];
        productArray[0] = new Product("Samsung S25 Ultra",  "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productArray[1] = new Product("Samsung A5",  "05.02.2020", "Samsung Corp.", "Korea", 500, true);
        productArray[2] = new Product("Note 12 Ultra",  "01.07.2024", "Xiaomi", "Korea", 5000, false);
        productArray[3] = new Product("IPhone 17 Pro",  "15.09.2025", "Apple", "USA", 10000, false);
        productArray[4] = new Product("Iphone 16",  "06.10.2024", "Apple", "USA", 9999, true);
        productArray[3].infoOfProduct();

        Park park1 = new Park("Woodland");
        park1.attraction = park1.new Attraction("колесо обозрения", "12-15", 500);
        System.out.println("Park: " + park1.parkName + ", Attraction: " + park1.attraction.name);
    }   

    public static class Park {
        private String parkName;
        public Attraction attraction;

        public Park (String _name){
            parkName = _name;
        }
        
        public class Attraction{
            private String name;
            private String workTime;
            private int price;
            public Attraction(String _name, String _workTime, int _price){
                name = _name;
                workTime = _workTime;
                price = _price;
            }
        }

    }
}
