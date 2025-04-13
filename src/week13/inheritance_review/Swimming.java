package week13.inheritance_review;

public class Swimming extends OlympicSport {

    public Swimming(String name) {
        super(name);//calling parent class constructor
    }

    public Swimming() {
        super("Swimming");//calling parent class constructor
    }

    @Override
    public void compete() {
        //call parent version of method:
        super.complete();
        System.out.println("Attending Swimming competition - " + name);
    }

    @Override
    public String toString() {
        return "Swimming{" +
                "name='" + name + '\'' +
                '}';
    }
}
