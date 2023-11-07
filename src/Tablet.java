public class Tablet extends Device {
    private final String brand;
    private final String model;
    private boolean has_pencil;


    Tablet(String type, double price, double weight, String brand, String model, boolean has_pencil) {
        super(type, price, weight);

        this.brand = brand;
        this.model = model;
        this.has_pencil = has_pencil;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setHas_pencil(boolean has_pencil) {
        this.has_pencil = has_pencil;
    }
}
