package week13.abstract_and_interface;

public class Jacket extends Clothing implements HasHood {
    @Override
    public void wear() {
        System.out.println("Wearing a jacket...");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on a hood of a jacket...");
    }
}