public class Truck extends Vehicle {
    int Weight;
    int Wheels;

    public Truck (String brand, String model, int year, int weight, int wheels) {
        super(brand, model, year);
        Weight = weight;
        Wheels = wheels;
    }

    public void describe() {
        System.out.println("I'm "+Brand + " "+Model + " made in "+Year);
        System.out.println("I'm a Truck, I weight "+Weight + " kg and I have "+Wheels + " weels\n");
    }
}