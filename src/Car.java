public class Car {

    String carColor;
    String carEngine;
    int carTires;
    int speed;

    Car (String carColor, String carEngine, int carTires){
        this.carColor = carColor;
        this.carTires = carTires;
        this.carEngine = carEngine;
        setSpeed(carEngine);
    }

    void setSpeed(String engine){
        if(engine.equals("ferrari")){
            this.speed = 100;
        }else{
            this.speed = 90;
        }
    }

    int getSpeed(){
        return speed;
    }

    @Override
    public String toString() {
        return "Car [Color=" + carColor + ", Engine=" + carEngine + ", Tires=" + carTires + ", Speed=" + speed + "]";
    }


}
