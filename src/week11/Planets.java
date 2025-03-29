package week11;
/*
Planet class with name and distanceFromSun variables
static variable galaxy
Constructor that accepts both values
and toString
 */
public class Planets {
    public String name;
    public long distanceFromSun;

    public static String galaxy= "Milky Way";

    public Planets(String name, long distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;


    }

    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                ", distanceFromSun=" + distanceFromSun +
                '}';
    }

    public static void main(String[] args) {

    }
}
