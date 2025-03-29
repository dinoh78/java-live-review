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

    public static String galaxy = "Milky Way";

    public Planets(String name, long distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceFromSun=" + distanceFromSun +
                '}';
    }

}


/*
Planet class with name and distanceFromSun variables
static variable galaxy
Constructor that accepts both values
and toString
 */