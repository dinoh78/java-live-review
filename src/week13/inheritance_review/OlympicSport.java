package week13.inheritance_review;

public abstract class OlympicSport{

    public String name;

    public OlympicSport(String name) {
        this.name = name;
    }

    public void complete() {
        System.out.println("Competing in Olympics...");
    }

    public abstract void compete();

    @Override
    public String toString() {
        return "OlympicSport{" +
                "name='" + name + '\'' +
                '}';
    }
}