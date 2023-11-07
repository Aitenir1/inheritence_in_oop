public class Device {
    String type;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double weight;
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    Device(String type, double price, double weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;
    }


}
