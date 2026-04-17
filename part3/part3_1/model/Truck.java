package part3.part3_1.model;

public class Truck extends Vehicle {
    private final double cargoCapacityTons;

    public Truck(String brand, String model, int year, double fuelLevel, double cargoCapacityTons) {
        super(brand, model, year, fuelLevel);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    @Override
    public double getFuelConsumption() {
        // TODO: 20 + cargoCapacityTons * 3.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return 20 + cargoCapacityTons * 3;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
