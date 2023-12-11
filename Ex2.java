public class Ex2{
    public static void main(String []args) {
        Car Car1 = new Car("Ferrari", "Testarossa", 1984, 1656, 4);
        Truck Truck1 = new Truck("Scania", "Frostfire", 2022, 6000, 6);
        Motorcycle Motor1 = new Motorcycle("Kawazaki", "Ninja", 2013, 170, 2);
        Car1.describe();
        Truck1.describe();
        Motor1.describe();
    }
}