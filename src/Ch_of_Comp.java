public class Ch_of_Comp {

    public enum Brands {
        ACER,
        APPLE,
        SAMSUNG,
        ASUS
    }

    // Класс Processor
    public static class Processor {
        private String model; // модель процессора
        private double speed; // тактовая частота (в ГГц)

        // Конструктор, принимающий на вход модель и тактовую частоту процессора
        public Processor(String model, double speed) {
            this.model = model;
            this.speed = speed;
        }

        // Getter и Setter для модели
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        // Getter и Setter для тактовой частоты
        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        /* Перераспределение, которое позволяет использовать метод toString
        конкретно для вывода характеристик процессора */
        @Override
        public String toString() {
            return "{Модель - '" + model + '\'' +
                    ", Тактовая частота - " + speed +
                    " ГГц" +
                    '}';
        }
    }

    // Класс Memory
    public static class Memory {
        private int size;  // объем памяти (в ГБ)

        // Конструктор, принимающий на вход объем памяти
        public Memory(int size) {
            this.size = size;
        }

        // Getter и Setter для объема памяти
        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "{Объём - " + size +
                    " Гб" +
                    '}';
        }
    }

    // Класс Monitor
    public static class Monitor {
        private String screen_resolution; // разрешение экрана

        // Конструктор, принимающий на вход разрешение экрана
        public Monitor(String screen_resolution) {
            this.screen_resolution = screen_resolution;
        }

        // Getter и Setter для разрешения экрана
        public String getScreen_resolution() {
            return screen_resolution;
        }

        public void setScreen_resolution(String screen_resolution) {
            this.screen_resolution = screen_resolution;
        }

        @Override
        public String toString() {
            return "{Разрешение экрана - " + screen_resolution +
                    '}';
        }
    }


}
