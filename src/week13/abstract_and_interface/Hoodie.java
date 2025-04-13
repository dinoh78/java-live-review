package week13.abstract_and_interface;


public class Hoodie extends Clothing implements SportsWear, HasHood {

    @Override
    public void wear() {
        System.out.println("Wearing a Hoodie...");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on a hood...");
    }

    @Override
    public void wearAndWorkout() {
        System.out.println("Wearing a Hoodie and working out...");
    }
}