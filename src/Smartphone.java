public class Smartphone extends Device {
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        if (ssd > 0 && (ssd & (ssd - 1)) == 0) this.ssd = ssd;
        else System.out.println("INVALID VALUE FOR SSD");
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        if (cameraResolution < 2 || cameraResolution > 100) {
            System.out.println("INVALID VALUE FOR CAMERA RESOLUTION");
        } else this.cameraResolution = cameraResolution;
    }

    private String brand;
    private String model;
    private int ram;
    private int ssd;
    private double cameraResolution;

    Smartphone(String type, double price, double weight, String brand, String model, int ssd, int ram, double cameraResolution) {
        super(type, price, weight);

        this.setBrand(brand);
        this.setModel(model);
        this.setRam(ram);
        this.setSsd(ssd);
        this.setCameraResolution(cameraResolution);
    }

    void showInfo() {
        System.out.printf("BRAND %s\n", this.getBrand());
        System.out.printf("MODEL %s\n", this.getModel());
        System.out.printf("RAM %d\n", this.getRam());
        System.out.printf("SSD %d\n", this.getSsd());
        System.out.printf("PRICE %.2f\n", this.getPrice());
        System.out.printf("WEIGHT %.2f\n", this.getWeight());
        System.out.printf("CAMERA RESOLUTION %.2f\n", this.getCameraResolution());
    }
}
