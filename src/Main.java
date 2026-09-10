public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "Black", 2020, "Louay");
        Car car2 = new Car("Ferrari", "Red", 2022, "Hank");

        Garage garage = new Garage(5);

        garage.addCar(car);
        garage.addCar(car);
        garage.addCar(car2);
        garage.garageContent();
        garage.removeCar(car);
        garage.garageContent();


    }
}
