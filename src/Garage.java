import java.util.ArrayList;

public class Garage {
    private int maxCapacity;
    private ArrayList<Car> cars = new ArrayList<Car>();

    Garage(int maximumCapacity){
        maxCapacity = maximumCapacity ;
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }

    public void garageContent(){
            for(Car car:cars ){
                System.out.println(car.getModel());
            }
    }
    public void expendgarage(int n){
        if(n>=0){
            maxCapacity += n;}
    else{
        maxCapacity-=n;}
    }

    public void addCar(Car car){
        if (cars.size() <maxCapacity && !cars.contains(car)){
            cars.add(car);
        }
        else{
            System.out.println("Requirements are not met");
        }
    }

    public void removeCar(Car car){
        if(cars.contains(car)){
            cars.remove(car);
        }
        else{
            System.out.println("This car is not in the garage");
        }
    }

}
