public class Car {
    private String model;
    private String color;
    private int year;
    private String owner;
    private boolean engineRunning = false;

    Car(String model, String color, int year, String owner) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year > 1886){
            this.year = year;
        }
        else{
            System.out.println("Year should not be earlier than 1886");
        }
    }
    public String getOwner() {
        return owner;
    }

    public void startEngine(){
        if(engineRunning){
            System.out.println(this.model + " engine is already running!");
        }
        else {
            engineRunning = true;
            System.out.println(this.model + " engine started");}

    }
    public void stopEngine(){
        if(engineRunning){
            engineRunning = false;
            System.out.println(this.model + " engine stopped!");
        }
        else {
            System.out.println(this.model + " engine already stopped");}}

    public boolean isEngineRunning() {
        return this.engineRunning;}

    public void changeColor(String newColor) {
        this.color = newColor;
    }
    public void drive(){
        if(isEngineRunning()){
            System.out.println(this.model+" is driving!");
        }
        else{System.out.println(this.model+" cannot drive because the engine is off!");}
    }
    }



