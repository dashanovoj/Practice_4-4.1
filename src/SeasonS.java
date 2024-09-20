public class SeasonS {

    // Перечисление, содержащее времена года
    public enum Seasons {
        // Константы времен года с названиями и среднеми температурами (3)
        WINTER("Зима", -6),
        SPRING("Весна",8),
        SUMMER("Лето", 23) {
            // Переопределение метода getDescription для константы SUMMER (5)
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN("Осень", 10);

        // Поле для хранения названия времени года
        private final String name;

        // Поле для хранения средней температуры
        private final int Avg_Temp;


        // Конструктор для определения названия времени года и его средней температуры (4)
        Seasons(String name, int avg_Temp) {
            this.name = name;
            this.Avg_Temp = avg_Temp;
        }

        // Getter для получения названия времени года
        public String getName() {
            return name;
        }

        // Getter для получения значения средней температуры
        public int getAvg_Temp() {
            return Avg_Temp;
        }

        // Метод getDescription, возвращающий строку “Холодное время года” (5)
        public String getDescription() {
            return "Холодное время года";
        }
    }

    // Метод для вывода "Я люблю season" (2)
    public static void Love_Season (Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        // Переменная, содержащая любимое время года (1)
        Seasons Fav_Season = Seasons.SUMMER;

        // Распечатать всю информацию о любимом времени года (1)
        System.out.println("Любимое время года: " + Fav_Season.getName());
        System.out.println("Средняя температура: " + Fav_Season.getAvg_Temp() + "°C");
        System.out.println("Описание: " + Fav_Season.getDescription());

        Love_Season(Fav_Season); // Метод "Я люблю..."

        /* В цикле распечатать все времена года, среднюю температуру и
        описание времени года (6) */
        System.out.println("\nВсе времена года:");
        for (Seasons season : Seasons.values()) { // массив из констант enum
            System.out.println(season.getName() + "\n Средняя температура: " + season.getAvg_Temp() + "°C\n Описание времени года: " + season.getDescription());
        }

    }
}