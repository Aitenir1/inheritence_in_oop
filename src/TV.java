public class TV extends Device {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplayTechnology() {
        return displayTechnology;
    }

    public void setDisplayTechnology(String displayTechnology) {
        this.displayTechnology = displayTechnology;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    private String brand;
    private String model;
    private String displayTechnology;
    private double screenSize;
    private int refreshRate;

    TV(String type,
           double price,
           double weight,
           String brand,
           String model,
           String displayTechnology,
           double screenSize,
           int refreshRate) {

        super(type, price, weight);
        this.brand = brand;
        this.model = model;
        this.displayTechnology = displayTechnology;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
    }

    void showInfo() {
        System.out.printf("TYPE: %s\n", this.type);
        System.out.printf("BRAND: %s\n", this.brand);
        System.out.printf("MODEL: %s\n", this.model);
        System.out.printf("DISPLAY TECHNOLOGY: %s\n", this.displayTechnology);
        System.out.printf("SCREEN SIZE: %s\n", this.screenSize);
        System.out.printf("REFRESH RATE: %s\n", this.refreshRate);
    }
}
