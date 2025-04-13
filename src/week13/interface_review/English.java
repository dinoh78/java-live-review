package week13.interface_review;

public class English implements Language{
    @Override
    public String hello() {
        return "Hello!";
    }

    @Override
    public String bye() {
        return "Bye bye!";
    }
}