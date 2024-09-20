/* Создать абстрактный класс, описывающий сущность мебель. С
помощью наследования реализовать различные виды мебели. Также создать
класс FurnitureShop, моделирующий магазин мебели. Протестировать работу
классов. */
import java.util.ArrayList; // используется для хранения изменяемого размера массива элементов в списке
import java.util.List; // используется для создания списков объектов и работы с ними

public class Types_of_Furniture {

    // Абстрактный класс, описывающий сущность "Мебель"
    public static abstract class Furniture {
        protected String material;
        protected String color;
        protected int price;

        // Конструктор, принимающий на вход материал, цвет и цену
        public Furniture(String material, String color, int price) {
            this.material = material;
            this.color = color;
            this.price = price;
        }

        /* Абстрактный метод, который будет реализован в подклассах -
        отображение конкретной информации о каждом типе мебели */
        public abstract void displayInfo();

    }

    // Дочерний класс Chair
    static class Chair extends Furniture {
        private boolean hasArmRests; // булева переменная на наличие подлокотников

        // Конструктор
        public Chair(String material, String color, int price, boolean hasArmRests) {
            super(material, color, price); // вызов конструктора класса родителя
            this.hasArmRests = hasArmRests;
        }

        // Вывод да/нет в зависимости от наличия подлокотников
        public String isHasArmRests() {
            if (hasArmRests) {
                return "Да";
            }
            else return "Нет";
        }

        // Абстрактный метод из класса Furniture
        @Override
        public void displayInfo() {
            System.out.println("Стул \n Материал: " + material + "\n Цвет: " + color + "\n Цена: " + price + " ₽" +
                    "\n Наличие подлокотников: " + isHasArmRests());
        }
    }

    // Дочерний класс Table
    static class Table extends Furniture {
        private int Table_Legs; // переменная для определения количества ножек стола

        // Конструктор
        public Table(String material, String color, int price, int table_Legs) {
            super(material, color, price); // вызов конструктора класса родителя
            Table_Legs = table_Legs;
        }

        // Getter
        public int getTable_Legs() {
            return Table_Legs;
        }

        @Override
        public void displayInfo() {
            System.out.println("Стол \n Материал: " + material + "\n Цвет: " + color + "\n Цена: " + price + " ₽" +
                    "\n Количество ножек: " + Table_Legs);
        }
    }

    // Дочерний класс Sofa
    static class Sofa extends Furniture {
        private int Seats; // переменная для определения количество мест на диване

        // Конструктор
        public Sofa(String material, String color, int price, int seats) {
            super(material, color, price); // вызов конструктора класса родителя
            Seats = seats;
        }

        // Getter
        public int getSeats() {
            return Seats;
        }

        @Override
        public void displayInfo() {
            System.out.println("Диван \n Материал: " + material + "\n Цвет: " + color + "\n Цена: " + price + " ₽" +
                    "\n Количество мест: " + Seats);
        }
    }

    static class FurnitureShop {
        // Создаём список объектов класса Furniture
        private List<Furniture> furnitureList;

        // Конструктор, инициализирующий поле furnitureList
        public FurnitureShop() {
            furnitureList = new ArrayList<>();
        }

        // Метод для добавления мебели в список
        public void AddFurniture(Furniture furniture) {
            furnitureList.add(furniture);
        }

        // Метод для отображения информации о всей мебели
        public void displayFurniture() {
            for (Furniture furniture : furnitureList) {
                furniture.displayInfo();
            }
        }
    }

}
