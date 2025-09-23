package Lesson_2;
public class Product {
    private String name;
           private String dateOfProduction;
           private String manufacturer;
           private String countryProduction;
           private int price;
           private boolean bookingStatus;
           
           public Product(String _name, String _dateOfProduction, String _manufacturer, String _countryProduction, int _price, boolean _bookingStatus){
               name = _name;
               dateOfProduction = _dateOfProduction;
               manufacturer = _manufacturer;
               countryProduction = _countryProduction;
               price = _price;
               bookingStatus = _bookingStatus;
           }
            public void infoOfProduct() {
               System.out.println("Информация об объекте: Название - " + this.name + " Дата производства - "
               + this.dateOfProduction + " Производитель - " + this.manufacturer + " Страна производитель - " 
               + this.countryProduction + " Цена - " + this.price + " Статус заказа - " + this.bookingStatus);
            }
    
}
