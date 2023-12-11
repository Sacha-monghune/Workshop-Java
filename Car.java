public class Car extends Vehicle {
    int Weight;
    int Wheels;

    public Car (String brand, String model, int year, int weight, int wheels) {
        super(brand, model, year);
        Weight = weight;
        Wheels = wheels;
    }

    public void accelerate() {
       System.out.println("My "+Brand + " goes like this : VROOOooooooom !");
    }

    public void describe() {
        System.out.println("I'm "+Brand + " "+Model + " made in "+Year);
        System.out.println("I'm a Car, I weight "+Weight + " kg and I have "+Wheels + " weels\n");
    }
}