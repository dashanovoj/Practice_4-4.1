public class Test_Computer {

    static class Computer {
        // Поля: Бренд, процессор, память и монитор компьютера
        private Ch_of_Comp.Brands brand;
        private Ch_of_Comp.Processor processor;
        private Ch_of_Comp.Memory memory;
        private Ch_of_Comp.Monitor monitor;

        /* Конструктор, принимающий на вход бренд, процессор, память и монитор
        компьютера */
        public Computer(Ch_of_Comp.Brands brand, Ch_of_Comp.Processor processor, Ch_of_Comp.Memory memory, Ch_of_Comp.Monitor monitor) {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.monitor = monitor;
        }

        // Getter'ы для бренда, процессора, памяти и монитора компьютера
        public Ch_of_Comp.Brands getBrand() {
            return brand;
        }

        public Ch_of_Comp.Processor getProcessor() {
            return processor;
        }

        public Ch_of_Comp.Memory getMemory() {
            return memory;
        }

        public Ch_of_Comp.Monitor getMonitor() {
            return monitor;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "brand=" + brand +
                    ", processor=" + processor +
                    ", memory=" + memory +
                    ", monitor=" + monitor +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Экземпляры процессора, памяти и монитора
        Ch_of_Comp.Processor processor = new Ch_of_Comp.Processor("Intel Core i5", 2.42);
        Ch_of_Comp.Memory memory = new Ch_of_Comp.Memory(8);
        Ch_of_Comp.Monitor monitor = new Ch_of_Comp.Monitor("1920x1080");

        Computer computer = new Computer(Ch_of_Comp.Brands.ACER, processor, memory, monitor);
        System.out.print("Бренд компьютера: " + computer.getBrand() +
                "\nПроцессор компьютера: " + computer.getProcessor() + "\nПамять компьютера: "
                        + computer.getMemory() + "\nМонитор компьютера: " + computer.getMonitor());
    }
}
