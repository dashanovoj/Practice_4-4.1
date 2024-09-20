public class Test_Furniture {

    public static void main(String[] args) {

        //Создаём магазин мебели
        Types_of_Furniture.FurnitureShop shop = new Types_of_Furniture.FurnitureShop();

        // Создаём различные виды мебели
        Types_of_Furniture.Furniture chair = new Types_of_Furniture.Chair("Дерево", "Белый", 3000, false);
        Types_of_Furniture.Furniture table = new Types_of_Furniture.Table("Метал", "Чёрный", 5000, 4);
        Types_of_Furniture.Furniture sofa = new Types_of_Furniture.Sofa("Текстиль", "Бежевый", 15000, 2);

        // Добавляем мебель в магазин
        shop.AddFurniture(chair);
        shop.AddFurniture(table);
        shop.AddFurniture(sofa);

        System.out.println("Добро пожаловать в магазин мебели! В наличии имеются: ");
        
        // Отображаем информацию о мебели
        shop.displayFurniture();

    }

}
