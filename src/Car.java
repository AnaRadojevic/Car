
public class Car {

    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    String license = "ACR-004";
    char condition;
    double curentPrice = 3000;
    int mileagePassed = 50000;

    public Car() {
    }

    public Car(int maxSpeed, int minSpeed, double weight, boolean isTheCarOn,
            String license, char condition, double curentPrice, int mileagePassed) {

        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.weight = weight;
        this.isTheCarOn = isTheCarOn;
        this.license = license;
        this.condition = condition;
        this.curentPrice = curentPrice;
        this.mileagePassed = mileagePassed;

    }
}
