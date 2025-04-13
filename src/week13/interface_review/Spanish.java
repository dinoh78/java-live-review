package week13.interface_review;

public class Spanish implements Language {
    @Override
    public String hello() {
        return "Hola!";
    }

    @Override
    public String bye() {
        return "Adios!";
    }
}