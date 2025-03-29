package week11;

public class Device {
    public String name;
    public double price;
    public double rating;
    public Device() {
        System.out.println("Device no-args constractor");
        this.name="unknown";
    }

    public Device(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
