public class Vehicle {
    String Brand;
    String Model;
    int Year;
    int Weight;
    int Wheels;

    public Vehicle (String brand, String model, int year) {
        Brand = brand;
        Model = model;
        Year = year;
        Weight = weight;
        Wheels = wheels;
    }

    public void Accelerate () {
        System.out.println("I'm puttilng the pedal to the metal! (Let's hope the car dosent explode)");
    }
    public void Brake() {
        System.out.println("Woah! Slow down boy!");
    }

    public void Describe() {
        System.out.println("I'm a "+Brand + " "+Model + " made in "+Year);

    }
}
